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

public class BubbleTest
{
    Logger log = Logger.getLogger("MyLogger");
    ConsoleHandler cHand = new ConsoleHandler();
    public SpecialTesterClass specialTester = new SpecialTesterClass();
    public SortTesterClass sortTesterClass = new SortTesterClass();

    @Before
    public void beforeEachTest()
    {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.fine("Starting new test!");
    }

    @Test
    public void sortTest()
    {




        assertEquals(true, sortTesterClass.RandomIntTest(0));
        assertEquals(true, sortTesterClass.RandomIntTest(1));
        assertEquals(true, sortTesterClass.RandomIntTest(2));
    }


    @Test
    public void oneNumberTest()
    {

        assertEquals(true, specialTester.OneElementTest(0));
        assertEquals(true, specialTester.OneElementTest(1));
        assertEquals(true, specialTester.OneElementTest(2));
    }


    @Test
    public void reverseListTest()
    {
        assertEquals(true, sortTesterClass.ReverseListTest(0));
        assertEquals(true, sortTesterClass.ReverseListTest(1));
        assertEquals(true, sortTesterClass.ReverseListTest(2));

    }

    @Test
    public void emptyListTest()
    {

        assertEquals(true,specialTester.EmptyCollectionTest(0));
        assertEquals(true,specialTester.EmptyCollectionTest(1));
        assertEquals(true,specialTester.EmptyCollectionTest(2));


    }


    @After
    public void afterEachTest()
    {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.fine("Ending test!");
    }





}
