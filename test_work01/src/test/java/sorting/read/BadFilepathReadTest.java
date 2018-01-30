package sorting.read;

import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;


import java.io.*;

import static org.junit.Assert.assertTrue;

public class BadFilepathReadTest {

    @Test
    public void badPathTest() {
        boolean thrown = false;
        try {
            RawDataReader dataReader = new RawDataReader();
            String path = "/X/x.txt";
            dataReader.readData(path);
        } catch (FileNotFoundException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}
