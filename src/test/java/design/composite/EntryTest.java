package design.composite;

import org.junit.Test;

import design.builder.model.Director;
import design.composite.model.Directory;
import design.composite.model.File;
import design.composite.model.FileTreatmentException;

public class EntryTest {

    @Test
    public void testEntry() {
        try {
            // 构建目录
            System.out.println("创建 root 目录");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory usr = new Directory("usr");
            root.add(bin);
            root.add(tmp);
            root.add(usr);

            // root
            bin.add(new File("vi", 1000));
            bin.add(new File("latex", 2000));

            // usr
            System.out.println("创建 usr 目录");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usr.add(yuki);
            usr.add(hanako);
            usr.add(tomura);

            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 50));

            File memo = new File("memo.tex", 500);
            hanako.add(memo);

            tomura.add(new File("game.doc", 500));
            tomura.add(new File("iunk.mail", 800));

            root.printList();

            // absolute path
            System.out.println("hanako absolute path: " + hanako.getAbsolutePath());
            System.out.println("memo absolute path: " + memo.getAbsolutePath());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }

    }

}
