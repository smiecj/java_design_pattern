package design.factory.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 汽车生成工厂
public class CarFactory extends Factory implements Iterable {

    List<Product> carList = new ArrayList<>();

    @Override
    protected Product createProduct(String name) {
        CarProduct car = new CarProduct(name);
        return car;
    }

    @Override
    protected void registerProduct(Product product) {
        this.carList.add(product);
    }

    public int productSize() {
        return this.carList.size();
    }

    @Override
    public Iterator iterator() {
        return new CarFactoryIterator(this);
    }

}
