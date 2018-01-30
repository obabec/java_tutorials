package sorting.read;

import com.redhat.data.PlainFileDataReader;
import com.redhat.sorting.read.RawDataReader;
import org.junit.Test;
import sorting.DataStream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReadTest {

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
