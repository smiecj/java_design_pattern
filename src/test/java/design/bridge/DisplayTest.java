package design.bridge;

import org.junit.Test;

import design.bridge.model.CharDisplayImpl;
import design.bridge.model.CountDisplay;
import design.bridge.model.Display;
import design.bridge.model.RandomCountDisplay;
import design.bridge.model.StairDisplay;
import design.bridge.model.StringDisplayImpl;

public class DisplayTest {

    @Test
    public void testDisplay() {
        // Default Display & Count Display
        Display displayWorld = new Display(new StringDisplayImpl("Hello World"));
        Display displayGolang = new Display(new StringDisplayImpl("Hello Golang"));
        CountDisplay displayJava = new CountDisplay(new StringDisplayImpl("Hello Java"));
        RandomCountDisplay displayPython = new RandomCountDisplay(new StringDisplayImpl("Hello Python"));

        displayWorld.display();
        displayGolang.display();
        displayJava.multiplePrint(3);
        displayPython.randomPrint(10);

        // Stair Display
        StairDisplay displayStar = new StairDisplay(new CharDisplayImpl('<', '*', '>'));
        StairDisplay displayHash = new StairDisplay(new CharDisplayImpl('|', '#', '-'));
        displayStar.stairPrint(5, 1);
        displayHash.stairPrint(10, 2);
    }

}
