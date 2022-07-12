package design.decorator;

import org.junit.Test;

import design.decorator.model.Border;
import design.decorator.model.Display;
import design.decorator.model.FullBorder;
import design.decorator.model.MultiStringDisplay;
import design.decorator.model.SideBorder;
import design.decorator.model.StringDisplay;
import design.decorator.model.UpDownBorder;

public class DisplayTest {
    @Test
    public void testDisplay() {
        Display sd = new StringDisplay("Hello World");
        Border sb = new SideBorder(sd, '#');
        Border fb = new FullBorder(sb);

        sd.show();
        sb.show();
        fb.show();

        // 这里展示装饰模式比较复杂的效果: 多层嵌套
        // 实测: 打印中文字符依然会有格式问题
        Display b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new StringDisplay("你好，世界"), '*'))),
                '/');
        b4.show();

        // UpDownBorder
        Display udb = new UpDownBorder(sd, '-');
        udb.show();

        Display b4WithUpDown = new FullBorder(new UpDownBorder(
                new SideBorder(new UpDownBorder(new SideBorder(new StringDisplay("Hello World"), '*'), '='), '|'),
                '/'));
        b4WithUpDown.show();

        // MultiStringDisplay
        MultiStringDisplay msd = new MultiStringDisplay();
        msd.add("Good Morning");
        msd.add("Good Afternoon");
        msd.add("Good Evening");
        msd.show();

        Display b3 = new FullBorder(msd);
        b3.show();
    }
}
