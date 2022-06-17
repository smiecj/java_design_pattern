package design.abstractfactory.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Page: 页面主要信息，包含作者、标题等
public abstract class Page {
    // title: 标题
    protected String title;
    // author: 作者
    protected String author;
    // 页面描述扩展内容
    protected List<Item> contents = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // add: 向页面描述添加内容
    public void add(Item item) {
        this.contents.add(item);
    }

    // output: 输出页面对象
    // 本质上也是输出对象的工厂类，只不过 Link 是输出链接，Page 是输出文件
    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName + ": 编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // makeHTML: 生成页面描述信息
    // 问题: 为什么不继承 Item? -- 因为 Page 不包含 caption 信息，本质上不是同一种对象
    // -- 单说行为确实是一样的，但是类对应的内容完全不同
    // 答案: 如果 Page 也继承了 Item，Tray 就可以添加 Page 了，但这个是不符合业务逻辑的
    // 更巧妙的做法: Item 和 Production 都继承接口 HTMLable
    public abstract String makeHTML();
}
