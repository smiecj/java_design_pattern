package design.template.model;

public class StringDisplay extends AbstractDisplay {

    private String text;

    public StringDisplay(String text) {
        this.text = text;
    }

    @Override
    protected void open() {
        String repeatMinus = new String(new char[text.length()]).replace("\0", "-");
        System.out.println("+" + repeatMinus + "+");
    }

    @Override
    protected void print() {
        System.out.println("|" + this.text + "|");
    }

    @Override
    protected void close() {
        // same as open
        open();
    }

}
