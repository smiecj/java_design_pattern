
package design.builder.model;

// Director: 装饰器: 负责使用 builder
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("program_day");
        builder.makeString("上午");
        builder.makeItems(new String[] { "Java", "C++" });
        builder.makeString("下午");
        builder.makeItems(new String[] { "Golang", "Python" });
        builder.makeString("晚上");
        builder.makeItems(new String[] { "散步", "游戏" });
        builder.close();
    }
}
