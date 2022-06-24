package design.strategy.model;

import java.util.Random;

// RandomStrategy: 完全随机策略
public class RandomStrategy implements Strategy {

    private Random random;

    // 构造方法: 可设置随机 seed
    public RandomStrategy(long seed) {
        this.random = new Random(seed);
    }

    @Override
    public void recordResult(boolean win) {
        // do nothing
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(Hand.handCount));
    }

}
