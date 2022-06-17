package design.abstractfactory.model;

import java.util.Iterator;

// ListPage: 页面内容生成的具体实现，通过 HTML ul、li 生成列表
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head><body>\n");
        sb.append("<h1>" + title + "</h1>\n");

        sb.append("<ul>");
        Iterator<Item> it = this.contents.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");

        sb.append("<hr><address>" + author + "</address>");

        sb.append("</body></html>");
        return sb.toString();
    }

}
