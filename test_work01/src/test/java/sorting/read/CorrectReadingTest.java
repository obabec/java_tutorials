package sorting.read;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CorrectReadingTest {
    @Test
    public void correctReadTest() {

        File f = new File("temp.tmp");
        Collection collection = new ArrayList();
        collection.add("Ahoj1");
        collection.add("svete!2");
        collection.add("Tady3");


        DataStream dataStream = new DataStream();
        dataStream.setFilerino(f);
        dataStream.createFile(collection);

        RawDataReader dataReader = new RawDataReader();
        Collection dataFromReader = null;

        CommadLineParser commadLineParser = new CommadLineParser();
        commadLineParser.setPath(f.getPath());

        dataFromReader = new ArrayList (dataReader.readData(commadLineParser));


        assertEquals(collection, dataFromReader);



        dataStream.destroyFilerino();
    }
}
