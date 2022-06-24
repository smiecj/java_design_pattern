package design.strategy.model;

import java.util.Random;

// WinningStrategy: 赢的出法优先策略
public class WinningStrategy implements Strategy {

    private Hand lastHand;
    private boolean lastIsWin;
    private Random random;

    // 构造方法: 可设置随机 seed
    public WinningStrategy(long seed) {
        this.random = new Random(seed);
    }

    @Override
    public void recordResult(boolean win) {
        lastIsWin = win;
    }

    @Override
    public Hand nextHand() {
        if (null == lastHand || !lastIsWin) {
            // 随机一个出法
            return Hand.getHand(random.nextInt(Hand.handCount));
        } else {
            // 上一次获胜策略
            return lastHand;
        }
    }

}
