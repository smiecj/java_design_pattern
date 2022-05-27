package design.adapter.model;

// Printer 实现
// 封装 Banner 不对外暴露
public class BannerPrinter implements Printer {

    private Banner banner;

    public BannerPrinter(String name) {
        this.banner = new Banner(name);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
