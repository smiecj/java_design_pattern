package design.prototype;

import org.junit.Test;

import design.prototype.model.Manager;
import design.prototype.model.MessageBox;
import design.prototype.model.Underline;

public class ManagerTest {

    @Test
    public void testPrototype() {
        Manager manager = new Manager();

        MessageBox lineBox = new MessageBox('-');
        MessageBox starBox = new MessageBox('*');
        Underline underline = new Underline();

        manager.register("line", lineBox);
        manager.register("star", starBox);
        manager.register("underline", underline);

        String message = "Hello Java";
        manager.create("line").use(message);
        manager.create("star").use(message);
        manager.create("underline").use(message);

        MessageBox linePrototype = (MessageBox) manager.create("line");
        linePrototype.setBoxChar('=');
        // 测试最初的对象是否也会被修改 => 验证 @Object.clone() 生成的是新对象
        lineBox.use(message);
    }
}
