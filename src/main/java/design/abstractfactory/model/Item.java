package design.abstractfactory.model;

// Item: 带有标题的内容
public abstract class Item {
    // caption: 标题
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    // makeHTML: 生成 HTML 格式
    // 每一个 html 实体都要实现这个方法，用于生成页面内容
    public abstract String makeHTML();
}
