package design.abstractfactory.model;

// Link: 超链接格式
public abstract class Link extends Item {

    // url: 链接
    protected String url;

    // 构造方法: 初始化 标题、超链接, 对应 <a> 标签的内容 和 地址
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
