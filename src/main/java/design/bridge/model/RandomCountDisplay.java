package design.bridge.model;

// RandomCountDisplay: 随机次数展示
public class RandomCountDisplay extends CountDisplay {

    public RandomCountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomPrint(int times) {
        int randomTimes = (int) Math.floor(Math.random() * (times + 1));
        multiplePrint(randomTimes);
    }

}
