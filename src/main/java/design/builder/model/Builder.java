package design.builder.model;

// Builder: 定义工具类行为
// 注意: Builder 并不是最终 "build" 的对象，只是负责生产对象，需要通过具体实现类拿到
// 优化: 通过 template method 规范 makeTitle 方法一定要先调用，且不能重复调用
public abstract class Builder {

    private boolean initialized = false;

    public void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    public void close() {
        if (initialized) {
            closeDone();
        }
    }

    protected abstract void buildTitle(String str);

    protected abstract void buildString(String sstr);

    protected abstract void buildItems(String[] items);

    protected abstract void closeDone();
}
