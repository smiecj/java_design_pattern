package design.composite.model;

// File: 文件
// 文件路径在上层 Directory 中保存，这里只保存文件名
public class File extends Entry {

    private String path;
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String path) {
        // this: 自动调用 this.toString 方法
        System.out.println(path + java.io.File.separator + this);
    }

    @Override
    public String getAbsolutePath() {
        return path;
    }

    @Override
    protected void setAbsolutePath(String path) {
        this.path = path + java.io.File.separator + this.name;
    }

}
