package design.adapter.model.template.model;

// 模板方法模式: 父类定义基本行为，子类直接调用
public abstract class AbstractDisplay {

    // protected: 没必要对外开放的方法
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    // 父类定义的基本行为，子类不能再重写
    public final void display() {
        // 调用5次 print 方法
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
