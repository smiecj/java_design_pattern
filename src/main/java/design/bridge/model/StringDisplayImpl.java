package design.bridge.model;

// StringDisplayImpl: 字符串格式打印实现类
// +----+
// |test|
// +----+
public class StringDisplayImpl extends DisplayImpl {

    private String str;

    public StringDisplayImpl(String str) {
        this.str = str;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int index = 0; index < str.length(); index++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
