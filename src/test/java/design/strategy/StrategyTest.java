package design.strategy;

import org.junit.Test;

import design.strategy.model.Hand;
import design.strategy.model.Player;
import design.strategy.model.ProbStrategy;
import design.strategy.model.Strategy;
import design.strategy.model.WinningStrategy;
import design.strategy.sort.BubbleSorter;
import design.strategy.sort.MergeSorter;
import design.strategy.sort.QuickSorter;
import design.strategy.sort.SortAndPrint;
import design.strategy.sort.Sorter;

public class StrategyTest {

    private final int totalPlay = 10000;

    @Test
    public void testStrategy() {
        // 模拟两个玩家玩100局, 并对比结果
        Strategy winStrategy = new WinningStrategy(System.nanoTime());
        Strategy probStrategy = new ProbStrategy(System.nanoTime());

        Player player1 = new Player("smiecj", winStrategy);
        Player player2 = new Player("smielf", probStrategy);

        for (int i = 0; i < totalPlay; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStronger(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand2.isStronger(hand1)) {
                player1.lose();
                player2.win();
            } else {
                player1.draw();
                player2.draw();
            }
        }

        System.out.printf("%s\n", player1);
        System.out.printf("%s\n", player2);
    }

    @Test
    public void testSort() {
        // sorter
        // Sorter sorter = new BubbleSorter();
        // Sorter sorter = new QuickSorter();
        Sorter sorter = new MergeSorter();
        Integer[] intArr = new Integer[] { 5, 3, 2, 4, 1 };
        SortAndPrint printer = new SortAndPrint(intArr, sorter);
        printer.execute();
    }

}
