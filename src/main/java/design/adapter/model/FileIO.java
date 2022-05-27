package design.adapter.model;

import java.io.IOException;

// 文件 + 配置处理
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;

    public void writeToFile(String fileName) throws IOException;

    public void set(String key, String value);

    public String get(String key);
}