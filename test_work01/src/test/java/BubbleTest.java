import com.redhat.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

public class BubbleTest {
    Logger log = Logger.getLogger("MyLogger");
    ConsoleHandler cHand = new ConsoleHandler();
    SimpleFuncTests simpleTester = new SimpleFuncTests();
    SpecialFuncTest specialTester = new SpecialFuncTest();

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


    @Test
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
    }
}
