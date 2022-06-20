package design.bridge.model;

// CharDisplayImpl: 字符打印实现类
public class CharDisplayImpl extends DisplayImpl {

    private char start;
    private char toPrintC;
    private char end;

    public CharDisplayImpl(char start, char toPrintC, char end) {
        this.start = start;
        this.toPrintC = toPrintC;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(toPrintC);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
