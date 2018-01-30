package oldTests;

import com.redhat.sorts.*;

import java.util.*;
import java.util.List;

public class SimpleFuncTests <T extends Comparable> implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort, Comparator comparator) {
        BasicSorter sorter;
        switch (typeOfSort) {
            case 0:
                sorter = new BubbleSorter();
                break;

            case 1:
                sorter = new SelectSorter();
                break;

            case 2:
                sorter = new QuickSorter();
                break;

            case 3:
                sorter = new InsertSorter();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return sorter.sort(collection,comparator);
    }


    public List simpleSort(Collection collection, int typeOfSort) {

        collection = startSort(collection, typeOfSort,null);
        List dataList = new ArrayList(collection);
        return dataList;

    }
}
