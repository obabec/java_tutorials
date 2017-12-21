import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFuncTests implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort) {
        List returnList;
        switch (typeOfSort) {
            case 0:
                BubbleSorter bubbleSorterino = new BubbleSorter();
                returnList = bubbleSorterino.sort(collection);
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
        Random rand = new Random();

        for (int i = 0;i < 15;i++) {
            collectionOfNumbers.add(rand.nextInt());
        }

        List listForSort;
        listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());
        Collections.sort(listForSort);

        List controlList;
        for(int j = 0;j < 3;j++) {
            controlList = startSort(collectionOfNumbers, j);
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
