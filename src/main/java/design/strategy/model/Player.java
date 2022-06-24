package design.strategy.model;

// Player: 玩家
public class Player {

    private int totalPlay = 0;
    private int winPlay = 0;
    private int losePlay = 0;
    private int drawPlay = 0;

    private String name;
    private Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    // 记录比赛结果
    public void win() {
        strategy.recordResult(true);
        totalPlay++;
        winPlay++;
    }

    public void lose() {
        strategy.recordResult(false);
        totalPlay++;
        losePlay++;
    }

    public void draw() {
        totalPlay++;
        drawPlay++;
    }

    public String toString() {
        return String.format("[Player: %s] total play: %d, win: %d, draw: %d, lose: %d", name, totalPlay, winPlay,
                drawPlay, losePlay);
    }
}
