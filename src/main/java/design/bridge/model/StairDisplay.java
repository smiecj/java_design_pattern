package design.bridge.model;

// StairDisplay: 按阶梯形状打印实现类
// <>
// <*>
// <**>
public class StairDisplay extends CountDisplay {

    public StairDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    // 注意这里对 CountDisplay 的使用
    public void stairPrint(int maxLen, int step) {
        for (int currentTimes = 0; currentTimes <= maxLen; currentTimes += step) {
            this.multiplePrint(currentTimes);
        }
    }

}
