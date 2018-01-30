package sorting.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseSortTest {
    @Test
    public void reverseCollectionTest() {

        CollectionWorker collectionWorker = new CollectionWorker();
        Collection collection = new ArrayList();
        collection = collectionWorker.createCollectionForTest(collection);
        List controlList = new ArrayList(collection);
        Collections.sort(controlList);
        Collections.reverse(controlList);

        for(int i = 0; i < 3; i++){
            assertEquals(controlList,collectionWorker.startSort(i,collection, Collections.reverseOrder()));
        }


    }
}
