package design.factory.model;

import java.util.Iterator;

// 扩展: 汽车工厂类遍历器
public class CarFactoryIterator implements Iterator {

    private CarFactory factory;
    private int index;

    // 和 CarProduct 类似，CarFactoryIterator 也不需要给其他包访问
    CarFactoryIterator(CarFactory factory) {
        this.factory = factory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < factory.productSize()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.index < factory.productSize()) {
            return factory.carList.get(this.index++);
        }
        return null;
    }

}
