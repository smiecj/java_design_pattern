package design.decorator.model;

import java.util.ArrayList;
import java.util.List;

// MultiStringDisplay: 多行字符串打印
public class MultiStringDisplay extends Display {

    private List<String> strList = new ArrayList<>();
    private int maxColumn = 0;

    public void add(String str) {
        strList.add(str);
        if (maxColumn < str.getBytes().length) {
            maxColumn = str.getBytes().length;
        }
    }

    @Override
    public int getColumns() {
        return maxColumn;
    }

    @Override
    public int getRows() {
        return strList.size();
    }

    @Override
    public String getRowText(int row) {
        if (row < 0 || row >= strList.size()) {
            return null;
        }
        // 注意这里需要补齐 空格，否则被 FullBorder 修饰后，边框对不齐
        String str = strList.get(row);
        int toAppendSpaceCount = maxColumn - str.getBytes().length;
        return str + new String(new char[toAppendSpaceCount]).replace('\0', ' ');
    }
}
