package design.abstractfactory;

import org.junit.Test;

import design.abstractfactory.model.Factory;
import design.abstractfactory.model.Link;
import design.abstractfactory.model.Page;
import design.abstractfactory.model.Tray;

public class FactoryTest {

    @Test
    public void testFactory() {
        Factory factory = Factory.getFactory("design.abstractfactory.model.ListFactory");

        Link go = factory.createLink("go", "https://learnku.com/go");
        Link vue = factory.createLink("vue", "https://learnku.com/vuejs");
        Link python = factory.createLink("python", "https://learnku.com/python");

        Tray goTray = factory.createTray("go");
        goTray.add(go);
        goTray.add(factory.createLink("summary", "https://learnku.com/articles/68576"));
        goTray.add(factory.createLink("tools", "https://learnku.com/articles/63077"));

        Tray vueTray = factory.createTray("vue");
        vueTray.add(vue);
        vueTray.add(factory.createLink("communication", "https://learnku.com/articles/68297"));
        vueTray.add(factory.createLink("job", "https://learnku.com/vuejs/t/61952"));

        Tray pythonTray = factory.createTray("python");
        pythonTray.add(python);
        pythonTray.add(factory.createLink("extend", "https://learnku.com/python/t/64153"));
        pythonTray.add(factory.createLink("json", "https://learnku.com/python/t/64331"));

        Page page = factory.createPage("技术博客", "smiecj");
        page.add(goTray);
        page.add(vueTray);
        page.add(pythonTray);
        page.output();
    }

}
