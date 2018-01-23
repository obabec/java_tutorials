import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFuncTests <T extends Comparable> implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort, Comparator comparator) {
        List returnList;
        switch (typeOfSort) {
            case 0:
                BubbleSorter bubbleSorterino = new BubbleSorter();
                returnList = bubbleSorterino.sort(collection, comparator);
                break;

            case 1:
                SelectSorter selectSorterino = new SelectSorter();
                returnList = selectSorterino.sort(collection);
                break;

            default:
                InsertSorter insertSorterino = new InsertSorter();
                returnList = insertSorterino.sort(collection);
                break;
        }
        return returnList;
    }


    public List simpleSort(Collection collection, int typeOfSort) {

        collection = startSort(collection, typeOfSort,null);
        List dataList = new ArrayList(collection);
        return dataList;

    }
}
