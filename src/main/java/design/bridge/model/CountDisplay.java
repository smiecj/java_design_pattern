package design.bridge.model;

// CountDisplay: 针对 Display 的功能扩展 -- 打印多次
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiplePrint(int times) {
        open();
        for (int index = 0; index < times; index++) {
            print();
        }
        close();
    }

}
