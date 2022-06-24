package design.strategy.model;

import java.util.Random;

// ProbStrategy: 以最近两次的出拳情况 统计获胜概率，从而得到这次出拳方式
public class ProbStrategy implements Strategy {

    private int[][] winCountArr = new int[Hand.handCount][Hand.handCount];

    private Hand lastHand, currentHand;

    private Random random;

    public ProbStrategy(long seed) {
        // 初始化赢次数记录数组，注意默认次数需要为1 ，否则计算概率会有问题
        for (int x = 0; x < Hand.handCount; x++) {
            for (int y = 0; y < Hand.handCount; y++) {
                winCountArr[x][y] = 1;
            }
        }
        random = new Random(seed);
        // 初始化: 随机一个出拳组合
        int handIndex = random.nextInt(Hand.handCount);
        Hand initHand = Hand.getHand(handIndex);
        lastHand = currentHand = initHand;
    }

    @Override
    public void recordResult(boolean win) {
        if (win) {
            winCountArr[lastHand.getIndex()][currentHand.getIndex()]++;
        }
    }

    @Override
    public Hand nextHand() {
        int[] currentWinCountArr = winCountArr[currentHand.getIndex()];
        // 统计赢的总次数
        int totalWinCount = 0;
        for (int currentWinCount : currentWinCountArr) {
            totalWinCount += currentWinCount;
        }

        // 随机 + 落的范围判断
        int randomNum = random.nextInt(totalWinCount);
        int currentWinCount = 0;
        Hand nextHand = null;
        for (int index = 0; index < currentWinCountArr.length; index++) {
            currentWinCount += currentWinCountArr[index];
            if (randomNum < currentWinCount) {
                nextHand = Hand.getHand(index);
            }
        }
        lastHand = currentHand;
        currentHand = nextHand;
        return nextHand;
    }

}
