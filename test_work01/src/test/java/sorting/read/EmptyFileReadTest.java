package sorting.read;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EmptyFileReadTest {
    @Test
    public void emptyFileTest() {
        File f = new File("temp.tmp");
        CommadLineParser commadLineParser = new CommadLineParser();
        try {
            f.createNewFile();
            RawDataReader dataReader = new RawDataReader();
            f.deleteOnExit();
            commadLineParser.setPath(f.getPath());
            assertEquals(null, dataReader.readData(commadLineParser));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
