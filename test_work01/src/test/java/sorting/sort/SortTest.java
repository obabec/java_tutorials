package sorting.sort;

import com.redhat.sorting.sort.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SortTest {

    @Test
    public void sortTest() {
        CollectionWorker collectionWorker = new CollectionWorker();
        Collection collection = new ArrayList();
        collection = collectionWorker.createCollectionForTest(collection);

        List controlList = new ArrayList(collection);
        Collections.sort(controlList);

        for(int i = 0; i < 3; i++){
            assertEquals(controlList,collectionWorker.startSort(i,collection, null));
        }
    }

}
