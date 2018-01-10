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


    public boolean sortTest() {
        Collection collectionOfNumbers = new ArrayList();
        Integer chybovostSortovani = 0;

        Comparator<T> comparator = Collections.reverseOrder(null);

        collectionOfNumbers.add(5);
        collectionOfNumbers.add(8);
        collectionOfNumbers.add(1);

        List<T> listForSort;
        listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());
        Collections.sort(listForSort,comparator);

        List controlList;

        for(int j = 0;j < 3;j++) {
            controlList = startSort(collectionOfNumbers, j,comparator);
            Collections.reverse(controlList);
            if (!listForSort.equals(controlList)) {
                chybovostSortovani++;
            }
        }
        if (chybovostSortovani == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
