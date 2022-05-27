package design.adapter;

import org.junit.Test;

import design.adapter.model.BannerPrinter;
import design.adapter.model.Printer;

public class PrinterTest {
    @Test
    public void testBannerPrinter() {
        Printer bannerPrinter = new BannerPrinter("test");
        bannerPrinter.printWeak();
        bannerPrinter.printStrong();
    }
}
