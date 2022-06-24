package design.strategy.model;

import java.util.HashMap;
import java.util.Map;

// strategy: 策略模式
// Hand: 出拳
public class Hand {

    public static final int handCount = 3;

    // 出拳名称
    public static String rockName = "石头";
    public static String scissorName = "剪刀";
    public static String paperName = "布";

    // 出拳方式记录
    private static Hand scissor = new Hand(scissorName, 0);
    private static Hand rock = new Hand(rockName, 1);
    private static Hand paper = new Hand(paperName, 2);

    // 出拳方式数组
    private static Hand[] handArr = new Hand[] { scissor, rock, paper };

    // 出拳名称和方式映射表
    private static Map<String, Hand> handMap = new HashMap<String, Hand>() {
        {
            put(scissorName, scissor);
            put(rockName, rock);
            put(paperName, paper);
        }
    };

    private String name;
    // 出拳序号，用于比较出拳大小关系
    private int index;

    // getHand: 通过出拳名称获取出拳行为
    public static Hand getHand(String name) {
        return handMap.get(name);
    }

    // getHand: 通过下标获取出拳行为
    public static Hand getHand(int index) {
        return handArr[index];
    }

    private Hand(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // isStronger: 对比出拳大小
    public boolean isStronger(Hand hand) {
        int diff = this.index - hand.index;
        if (diff == 1 || diff == -2) {
            return true;
        }
        return false;
    }

    // getIndex: 获取出拳对应序号
    public int getIndex() {
        return this.index;
    }

}
