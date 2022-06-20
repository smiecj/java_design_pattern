package design.prototype.model;

import java.util.Collections;

public class Underline extends CloneNewInstance implements Product {

    public Underline() {
    }

    // "text"
    // ~~~~
    @Override
    public void use(String s) {
        System.out.printf("\"%s\"\n", s);

        System.out.printf(" %s \n", Collections.nCopies(s.length(), "~"));
    }

}
