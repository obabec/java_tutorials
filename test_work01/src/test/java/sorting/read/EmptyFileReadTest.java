package sorting.read;

import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EmptyFileReadTest {
    @Test
    public void emptyFileTest() {
        File f = new File("temp.tmp");
        try {
            f.createNewFile();
            RawDataReader dataReader = new RawDataReader();
            f.deleteOnExit();
            assertEquals(null, dataReader.readData(f.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
