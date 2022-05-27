package design.adapter.model;

// 数据展示类
public class Banner {
    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithParen() {
        System.out.println(String.format("(%s)", this.name));
    }

    public void showWithAster() {
        System.out.println(String.format("*%s*", this.name));
    }
}
