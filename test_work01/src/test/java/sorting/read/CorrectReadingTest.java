package sorting.read;

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

        try {
            dataFromReader = new ArrayList (dataReader.readData(f.getPath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(collection, dataFromReader);



        dataStream.destroyFilerino();
    }
}
