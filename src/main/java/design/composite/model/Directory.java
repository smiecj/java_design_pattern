package design.composite.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private String path;
    private String name;
    private List directory = new ArrayList<Entry>();

    public Directory(String name) {
        this.name = name;
        this.path = java.io.File.separator + this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    // getSize: 递归获取整个目录的大小
    @Override
    public int getSize() {
        int totalSize = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry child = (Entry) it.next();
            totalSize += child.getSize();
        }
        return totalSize;
    }

    // add: 向目录添加文件
    @Override
    public void add(Entry entry) throws FileTreatmentException {
        this.add(path, entry);
    }

    @Override
    protected void add(String path, Entry entry) throws FileTreatmentException {
        entry.setAbsolutePath(path);
        directory.add(entry);
    }

    // printList: 打印当前路径 和 所有子目录/文件
    @Override
    protected void printList(String prefix) {
        System.out.printf("%s%s%s\n", prefix, java.io.File.separator, this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry child = (Entry) it.next();
            child.printList(String.format("%s%s%s", prefix, java.io.File.separator, this));
        }
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
