package design.prototype.model;

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
