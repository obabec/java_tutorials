import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.File;
import java.util.*;

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
        Collection collection = new ArrayList();
        collection.add(8);
        collection.add(5);
        collection.add(12);
        List controlList = new ArrayList(collection);
        Collections.sort(controlList);
        for (int i = 0; i < 3; i++) {
            assertEquals(controlList,simpleTester.simpleSort(collection,i));
        }
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
        Collection collection = new ArrayList();
        collection.add(1);
        List controlList = new ArrayList(collection);
        for (int i = 0; i < 3; i++) {
            assertEquals(controlList,specialTester.oneElementTest(collection,i));
        }
    }


    @Test
    public void reverseListTest() {
        Collection collectionOfNumbers = new ArrayList();
        Random rand = new Random();

        for (int i = 0;i < 15;i++) {
            collectionOfNumbers.add(rand.nextInt());
        }
        List controlList = new ArrayList(collectionOfNumbers);
        Collections.sort(controlList);

        for (int i = 0; i < 3; i++) {
            assertEquals(controlList,specialTester.reverseListTest(controlList,i));
        }

    }

    @Test
    public void emptyListTest() {
        Collection collection = new ArrayList();
        for (int i = 0; i < 3; i++) {
            assertEquals(null,specialTester.emptyListTest(collection,i));
        }
    }

    @After
    public void afterEachTest() {
        LOGGER.info("Test ended");
    }
}
