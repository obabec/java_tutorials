package sorting.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class EmptyCollectionTest {
    @Test
    public void emptyCollectionTest() {
        Collection collection = new ArrayList();
        CollectionWorker collectionWorker = new CollectionWorker();

        for(int i = 0; i < 3; i++){
            assertEquals(null, collectionWorker.startSort(i, collection, null));
        }
    }
}
