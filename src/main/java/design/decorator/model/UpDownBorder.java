package design.decorator.model;

// UpDownBorder: 上下框修饰
public class UpDownBorder extends Border {
    private char ch;

    public UpDownBorder(Display display, char sideChar) {
        super(display);
        ch = sideChar;
    }

    @Override
    public int getColumns() {
        return this.display.getColumns();
    }

    @Override
    public int getRows() {
        return this.display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return new String(new char[getColumns()]).replace('\0', ch);
        } else if (row > 0 || row < getRows() - 1) {
            return this.display.getRowText(row - 1);
        } else {
            return null;
        }
    }
}
