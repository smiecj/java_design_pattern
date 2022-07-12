package design.decorator.model;

// Border: 对 Display 的修饰定义
public abstract class Border extends Display {
    // display: 被装饰的 Display 类
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
