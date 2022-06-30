package design.composite.model;

// composite: 组合模式
// Entry: 对象基本行为定义
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public abstract String getAbsolutePath();

    protected abstract void setAbsolutePath(String path);

    // add: 添加文件，注意必须提供默认实现，File 本身不需要实现
    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("Not Implement");
    }

    // add with path: 设置文件的绝对路径专用
    // protected: 该方法不必对外开放
    // 答案的实现: 给 Directory 和 File 添加 Entry Parent 对象，通过递归实现
    protected void add(String path, Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("Not Implement");
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String str);

    public String toString() {
        return String.format("%s(%d)", getName(), getSize());
    }
}
