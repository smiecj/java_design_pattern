package design.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import design.singleton.model.Triple;

public class TripleTest {

    @Test
    public void testTriple() {
        try {
            Triple instanceFirst = Triple.getInstance(0);
            Triple instanceSecond = Triple.getInstance(1);
            assertEquals("0", instanceFirst.getName());
            assertEquals("1", instanceSecond.getName());
        } catch (Exception e) {
            fail();
        }
    }

}
