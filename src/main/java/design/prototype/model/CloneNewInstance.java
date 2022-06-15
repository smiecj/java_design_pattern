package design.prototype.model;

// 优化: 相同的 Clone 行为放到同一个抽象类中，业务类直接继承即可
public abstract class CloneNewInstance {
    public Product createClone() {
        Product p = null;

        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getStackTrace());
        }

        return p;
    }
}
