package design.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import design.factory.model.CarFactory;
import design.factory.model.CarProduct;
import design.factory.model.Product;

public class FactoryTest {

    @Test
    public void testCarFactory() {
        CarFactory factory = new CarFactory();
        Product car1 = factory.create("特斯拉");
        Product car2 = factory.create("奔驰");
        Product car3 = factory.create("宝马");
        // car1.use();
        // car2.use();
        // car3.use();

        // 遍历所有产品
        Iterator it = factory.iterator();
        while (it.hasNext()) {
            CarProduct product = (CarProduct) it.next();
            product.use();
        }

        assertEquals(3, factory.productSize());
    }

}
