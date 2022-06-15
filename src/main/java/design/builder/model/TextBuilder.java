package design.builder.model;

// TextBuilder: 打印标准输出
public class TextBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        sb.append("========================\n");
        sb.append("《" + title + "》\n");
    }

    @Override
    public void buildString(String str) {
        sb.append(" • " + str + "\n");
        sb.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) {
            sb.append("  • " + item + "\n");
        }
        sb.append("\n");
    }

    @Override
    public void closeDone() {
        sb.append("========================\n");
    }

    public String getResult() {
        return sb.toString();
    }

}
