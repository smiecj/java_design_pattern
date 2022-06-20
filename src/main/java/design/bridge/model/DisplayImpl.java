package design.bridge.model;

// DisplayImpl: 原生 打印类 基本实现
// rawOpen: 打印前处理
// rawPrint: 打印
// rawClose: 打印后处理
// 也可以定义成 interface
public abstract class DisplayImpl {

    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();

}
