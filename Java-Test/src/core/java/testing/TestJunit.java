package core.java.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ManhKM on 4/14/2022
 * @project Java-Test
 */
public class TestJunit {
    String message = "Welcome Ha-Noi";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message,messageUtil.printMessage());
    }
}
