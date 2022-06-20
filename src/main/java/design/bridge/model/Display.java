package design.bridge.model;

// bridge: 桥接模式
// Display: 展示接口类定义，包含调用 DisplayImpl 基类的方式，要求创建的时候指定具体的实现类
public class Display {

    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open() {
        this.displayImpl.rawOpen();
    }

    public void print() {
        this.displayImpl.rawPrint();
    }

    public void close() {
        this.displayImpl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }

}
