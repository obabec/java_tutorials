import com.redhat.BasicSorter;
import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.util.*;
import java.util.stream.Collectors;

public class SpecialFuncTest implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort)
    {
        BasicSorter sorter;
        switch (typeOfSort) {
            case 0:
                sorter = new BubbleSorter();
                break;
            case 1:
                sorter = new InsertSorter();
                break;
            case 2:
                sorter = new SelectSorter();
                break;
            default:
                throw new IllegalArgumentException("exception");
        }

        return /*sorter.sort(collection)*/ null;

    }

    public boolean oneElementTest() {
        Collection collectionOfNumbers = new ArrayList();
        Integer chybovostSortovani = 0;
        collectionOfNumbers.add("a");
        List listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());

        for(int j = 0;j < 3;j++) {
            List controlList = startSort(collectionOfNumbers, j);
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

    public boolean emptyListTest() {
        Collection collectionOfNumbers = new ArrayList();
        Integer chybovostSortovani = 0;

        List listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());

        for(int j = 0;j < 3;j++) {
            List controlList = startSort(collectionOfNumbers, j);

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

    public boolean reverselistTest() {
        Collection collectionOfNumbers = new ArrayList();
        Integer chybovostSortovani = 0;

        Random rand = new Random();

        for (int i = 0;i < 15;i++) {
            collectionOfNumbers.add(rand.nextInt());
        }

        List listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());
        Collections.sort(listForSort);
        Collections.reverse(listForSort);

        for(int j = 0;j < 3;j++) {
            List controlList = startSort(listForSort, j);
            Collections.reverse(listForSort);
            if (!listForSort.equals(controlList)) {
                chybovostSortovani++;
            }
            Collections.reverse(listForSort);
        }

        if (chybovostSortovani == 0) {
            return true;

        }
        else {
            return false;
        }
    }


}
