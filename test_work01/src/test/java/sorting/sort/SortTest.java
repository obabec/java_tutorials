package sorting.sort;

import com.redhat.sorting.sort.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SortTest {

    @Test
    public void oneElementTest() {
        Collection collection = new ArrayList();
        collection.add("a");
        List controlList = new ArrayList(collection);
        for(int i = 0; i < 3; i++){
            assertEquals(controlList,startSort(i, collection, null));
        }

    }

    @Test
    public void emptyCollectionTest() {
        Collection collection = new ArrayList();

        for(int i = 0; i < 3; i++){
            assertEquals(null,startSort(i, collection, null));
        }
    }

    @Test
    public void sortTest() {
        Collection collection = new ArrayList();
        collection = createCollectionForTest(collection);

        List controlList = new ArrayList(collection);
        Collections.sort(controlList);

        for(int i = 0; i < 3; i++){
            assertEquals(controlList,startSort(i,collection, null));
        }
    }

    @Test
    public void reverseCollectionTest() {

        Collection collection = new ArrayList();
        collection = createCollectionForTest(collection);
        List controlList = new ArrayList(collection);
        Collections.sort(controlList);
        Collections.reverse(controlList);

        for(int i = 0; i < 3; i++){
            assertEquals(controlList,startSort(i,collection, Collections.reverseOrder()));
        }


    }

    public List startSort(int typeOfSort, Collection collection, Comparator comparator) {
        DataSorter dataSorter;
        switch (typeOfSort) {
            case 0: dataSorter = new BubbleSorter();
                    break;
            case 1: dataSorter = new SelectSorter();
                    break;
            case 2: dataSorter = new InsertSorter();
                    break;
            case 3: dataSorter = new QuickSorter();
                    break;
            default: throw new IllegalArgumentException();
        }

        return dataSorter.sort(collection);
    }

    public Collection createCollectionForTest(Collection collection) {
        collection.add(8);
        collection.add(35);
        collection.add(0);
        collection.add(12);
        collection.add(16);
        return collection;
    }
}
