package design.prototype.model;

import java.util.HashMap;

// Manager: 管理原型
public class Manager {

    private HashMap<String, Product> protoMap = new HashMap<>();

    public void register(String prototypeName, Product proto) {
        protoMap.put(prototypeName, proto);
    }

    public Product create(String prototypeName) {
        Product product = protoMap.get(prototypeName);
        return product.createClone();
    }

}
