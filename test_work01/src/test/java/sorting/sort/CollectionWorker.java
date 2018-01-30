package sorting.sort;

import com.redhat.sorting.sort.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CollectionWorker<T extends Comparable<T>> {

    public List startSort(int typeOfSort, Collection<T> collection, Comparator<T> comparator) {
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
