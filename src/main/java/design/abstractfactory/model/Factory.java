package design.abstractfactory.model;

// 抽象工厂: 参考 @design.factory.model.CarFactory, 这里的工厂只定义生成对象的方法，没有具体实现，也没有管理对象的功能，需要具体实现
public abstract class Factory {

    // 静态方法: 获取指定 Factory 实现类
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    // 抽象工厂: 创建最终对象的方式需要由子类定义
    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

}
