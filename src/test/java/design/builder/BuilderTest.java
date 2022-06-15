package design.builder;

import org.junit.Test;

import design.builder.model.Director;
import design.builder.model.HTMLBuilder;
import design.builder.model.TextBuilder;

public class BuilderTest {

    @Test
    public void testBuilder() {
        TextBuilder tb = new TextBuilder();
        Director textDirector = new Director(tb);
        textDirector.construct();
        System.out.println(tb.getResult());

        HTMLBuilder hb = new HTMLBuilder();
        Director htmlDirector = new Director(hb);
        htmlDirector.construct();
        System.out.println(hb.getResult());
    }
}
