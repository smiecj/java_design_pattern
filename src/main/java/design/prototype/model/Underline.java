package design.prototype.model;

public class Underline extends CloneNewInstance implements Product {

    public Underline() {
    }

    // "text"
    // ~~~~
    @Override
    public void use(String s) {
        System.out.printf("\"%s\"\n", s);
        System.out.printf(" %s \n", "~".repeat(s.length()));
    }

}
