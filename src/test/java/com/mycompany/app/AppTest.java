package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void test1() {
        Integer number = 1;
        assertEquals(1, 1);
    }

//    @Test
//    public void testAppMain()
//    {
//        App.main(null);
//        try {
//            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
//        } catch (AssertionError e) {
//            fail("\"message\" is not \"Hello World!\"");
//        }
//    }
//rgfrfrf
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
