
package design.factory.model;

// 汽车
public class CarProduct implements Product {

    private String name;

    // 注意: 具体产品的构造方法需要用 default 作用域 -- 子类、其他包都不可访问
    CarProduct(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("使用车: " + this.name);
    }

}
