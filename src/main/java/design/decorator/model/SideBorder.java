package design.decorator.model;

// SideBorder: 给需要被打印的字符加上边框
// |字符|
public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return this.display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return this.display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + this.display.getRowText(row) + borderChar;
    }

}
