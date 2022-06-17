package design.abstractfactory.model;

// ListLink: 链接内容生成，超链接
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format("  <li><a href=\"%s\">%s</a></li>\n", url, caption);
    }

}
