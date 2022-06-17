package design.abstractfactory.model;

import java.util.ArrayList;
import java.util.List;

// Tray: 可包含多个 Link 或 其他 Item 的容器
// tray: 托盘
public abstract class Tray extends Item {

    protected List<Item> itemList = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    // add: 添加元素
    public void add(Item item) {
        this.itemList.add(item);
    }
}
