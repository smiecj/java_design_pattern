package design.factory.model;

// 工厂抽象类，负责生成产品 (Product)
// 生成对象需要自己实现
public abstract class Factory {

    // 构造方法: 需要“登记”每一个新生成的产品
    public final Product create(String name) {
        Product product = createProduct(name);
        registerProduct(product);
        return product;
    }

    // 具体生成实例的方法这里，其实还可以交由子类来实现
    // 空实现: 必须交由子类来实现，适用于子类的行为区别比较大的情况
    // 默认实现: 父类可能需要更详细，特别是已经有一套生成对象方式的逻辑（比如文件流、配置解析）
    // 抛出异常: 和空实现类似，提示更清晰而已
    protected abstract Product createProduct(String name);

    protected abstract void registerProduct(Product product);
}
