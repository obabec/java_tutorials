import com.redhat.data.PlainFileDataReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;

public class DataStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataStream.class);

    public File getFilerino() {
        return filerino;
    }

    public void setFilerino(File filerino) {
        this.filerino = filerino;
    }

    public void destroyFilerino(){
        this.filerino.delete();
    }

    private File filerino = new File("");

    public void createFile(Collection collection){

        try {
            filerino.createNewFile();
        } catch (IOException e) {
            LOGGER.warn("Creation of file failed!");
            e.printStackTrace();
        }try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filerino.getPath()),"utf-8"))){

            if (collection != null){
                Iterator iterator = collection.iterator();
                while (iterator.hasNext()){
                br.write(String.valueOf(iterator.next()));
                br.newLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Collection initializeFile(){

        PlainFileDataReader fileReader = new PlainFileDataReader();
        Collection collectionData = fileReader.readData(filerino.getPath());
        return collectionData;

    }

}
