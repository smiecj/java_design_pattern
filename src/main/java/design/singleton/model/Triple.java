package design.singleton.model;

import lombok.Getter;

// 最多生成三个单例
public class Triple {
    private final static int maxSize = 3;
    private static Triple[] instanceList = new Triple[maxSize];

    @Getter
    private String name;

    private Triple(String name) {
        this.name = name;
    }

    // throw exception if exceed size
    // 第一次调用的时候进行3个元素的初始化
    // todo: 是否可以不加锁？
    public static Triple getInstance(int index) throws Exception {
        if (index < 0 || index >= maxSize) {
            throw new Exception("index bound exceed");
        }
        if (null == instanceList[index]) {
            instanceList[index] = new Triple(String.valueOf(index));
        }
        return instanceList[index];
    }
}
