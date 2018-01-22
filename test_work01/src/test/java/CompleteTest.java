import com.redhat.FileDataReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assert.assertEquals;

public class CompleteTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompleteTest.class);
    SimpleFuncTests simpleTester = new SimpleFuncTests();
    DataTest dataTester = new DataTest();
    //SpecialFuncTest specialTester = new SpecialFuncTest();

    @Before
    public void beforeEachTest() {
        LOGGER.info("Test started");
    }

    @Test
    public void sortTest() {
        assertEquals(true,simpleTester.sortTest());
    }
    @Test
    public void dataReaderTest() {
        assertEquals(1,dataTester.dataVerification());
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
    */
    @After
    public void afterEachTest() {
        LOGGER.info("Test ended");
    }
}
