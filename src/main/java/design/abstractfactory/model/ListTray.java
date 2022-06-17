package design.abstractfactory.model;

import java.util.Iterator;

// ListTray: 标签组内容生成，包含列表标题和列表
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(caption + "\n");

        sb.append("<ul>\n");
        Iterator<Item> it = this.itemList.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }

}
