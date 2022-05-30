package design.template;

import org.junit.Test;
// import org.junit.jupiter.api.Test;

import design.adapter.model.template.model.CharDisplay;
import design.adapter.model.template.model.StringDisplay;

public class DisplayTest {

    @Test
    public void testCharDisplay() {
        CharDisplay cd = new CharDisplay('l');
        cd.display();
    }

    @Test
    public void testStringDisplay() {
        StringDisplay sd = new StringDisplay("hello, world!");
        sd.display();
    }
}
