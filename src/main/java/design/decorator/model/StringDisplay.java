package design.decorator.model;

// StringDisplay: 字符串打印实现类
public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getColumns() {
        // 注意这里需要返回字符的长度，否则非英文字符打印格式会有问题
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return str;
        }
        return null;
    }

}
