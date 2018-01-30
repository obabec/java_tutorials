package sorting.read;

import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;
import sorting.DataStream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

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
        byte[] dataFromReader = new byte[0];

        try {
            dataFromReader = dataReader.readData(f.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collection controlCollection = new ArrayList();

        for (int i = 0; i < dataFromReader.length; i++) {
            controlCollection.add(dataFromReader[i]);

            assertEquals(collection, controlCollection);

        }

        dataStream.destroyFilerino();
    }
}
