import com.redhat.FileDataReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DataTest <T extends Comparable<T>> {

    public int dataVerification() {
        Collection collection = new ArrayList();
        Collection dataReaderCollection = null;
        String filePath = "testData.tmp";

        File tempDataFile = new File(filePath);
        try {
            tempDataFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"utf-8"))){
            collection.add("Ahoj");
            collection.add("888");
            collection.add("97415");
            collection.add("svete");

            Iterator<T> iterator = collection.iterator();
            while (iterator.hasNext()){
                br.write(String.valueOf(iterator.next()));
                br.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileDataReader fileDataReader = new FileDataReader();
        dataReaderCollection =  fileDataReader.readData(filePath);
        tempDataFile.delete();
        if (dataReaderCollection.equals(collection)){
            return 1;
        }else {
            return 0;
        }


    }

}
