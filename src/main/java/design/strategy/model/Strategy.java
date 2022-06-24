package design.strategy.model;

// Strategy: 策略接口
// 记录上一次出拳后胜负 & 提供下次出拳方式
public interface Strategy {

    public void recordResult(boolean win);

    public Hand nextHand();

}
