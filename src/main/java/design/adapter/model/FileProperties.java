package design.adapter.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

// 文件 - 配置操作具体实现类
public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            // 按配置格式解析
            String[] splitArr = line.split("=");
            if (splitArr.length == 2) {
                properties.setProperty(splitArr[0], splitArr[1]);
            }
        }
        br.close();
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (Map.Entry<Object, Object> entry : this.properties.entrySet()) {
            bw.write(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        bw.flush();
        bw.close();
    }

    @Override
    public void set(String key, String value) {
        this.properties.setProperty(key, value);
    }

    @Override
    public String get(String key) {
        return properties.getProperty(key);
    }
}
