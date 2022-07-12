package design.decorator.model;

// FullBorder: 四周包围打印
// +---+ 
// |字符|
// +---+
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return this.display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return this.display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row < 0 || row >= getRows()) {
            return null;
        }
        if (row == 0 || row == getRows() - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("+");
            for (int index = 0; index < getColumns() - 2; index++) {
                sb.append("-");
            }
            sb.append("+");
            return sb.toString();
        } else {
            return "|" + this.display.getRowText(row - 1) + "|";
        }
    }
}
