import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static org.junit.Assert.assertEquals;

public class BubbleTest {
    Logger log = Logger.getLogger("MyLogger");
    ConsoleHandler cHand = new ConsoleHandler();
    SimpleFuncTests simpleTester = new SimpleFuncTests();
    //SpecialFuncTest specialTester = new SpecialFuncTest();

    @Before
    public void beforeEachTest() {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.fine("Starting new test!");
    }

    @Test
    public void sortTest() {
        assertEquals(true,simpleTester.sortTest());
    }

   /* @Test
    public void oneElementTest() {
        assertEquals(true,specialTester.oneElementTest());
    }


    @Test
    public void reverseListTest() {
        assertEquals(true,specialTester.reverselistTest());
    }

    @Test
    public void emptyListTest() {
        assertEquals(true,specialTester.emptyListTest());
    }

    @After
    public void afterEachTest() {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.fine("Ending test!");
    }*/
}
