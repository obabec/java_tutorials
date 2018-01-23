import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class CompleteTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompleteTest.class);
    SimpleFuncTests simpleTester = new SimpleFuncTests();
    private DataStream dataStreamer = new DataStream();
    SpecialFuncTest specialTester = new SpecialFuncTest();

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
        Collection collection = new ArrayList();
        collection.add("Ahoj");
        collection.add("22");
        collection.add("11");
        collection.add("svete!");

        dataStreamer.setFilerino(new File("temporary.tmp"));
        dataStreamer.createFile(collection);

        Collection outputCollection = dataStreamer.initializeFile();
        assertEquals(collection,outputCollection);
        dataStreamer.destroyFilerino();
    }

    @Test
    public void emptyFileTest() {
        dataStreamer.setFilerino(new File("temporary.tmp"));
        dataStreamer.createFile(null);
        Collection outputCollection = dataStreamer.initializeFile();
        assertEquals(null,outputCollection);
        dataStreamer.destroyFilerino();
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
        LOGGER.info("Test ended");
    }
}
