package sorting.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OneElementSortTest {
    @Test
    public void oneElementTest() {
        Collection collection = new ArrayList();
        collection.add("a");
        CollectionWorker collectionWorker = new CollectionWorker();
        List controlList = new ArrayList(collection);
        for(int i = 0; i < 3; i++){
            assertEquals(controlList,collectionWorker.startSort(i, collection, null));
        }

    }

}
