
package design.adapter;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import design.adapter.model.FileProperties;

public class FilePropertiesTest {

    private static final String testPropertyFile = "/tmp/test.txt";

    @Test
    public void testFileProperties() throws IOException {
        FileProperties properties = new FileProperties();
        properties.set("test", "111");
        properties.writeToFile(testPropertyFile);
        properties.readFromFile(testPropertyFile);
        assertEquals("111", properties.get("test"));
    }
}
