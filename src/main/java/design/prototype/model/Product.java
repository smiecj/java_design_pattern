package design.prototype.model;

// 原型模式
// createClone: 各子类可自行实现拷贝的动作
// extends Cloneable: 不继承，调用 clone 会抛出 @CloneNotSupportedException 异常
public interface Product extends Cloneable {
    public void use(String s);

    public Product createClone();
}
