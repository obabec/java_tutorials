import com.redhat.*;

import java.util.*;
import java.util.stream.Collectors;

public class SpecialFuncTest implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort,Comparator comparator)
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

            case 3:
                sorter = new QuickSorter();
                break;

            default:
                throw new IllegalArgumentException("exception");
        }

        return sorter.sort(collection);

    }

    public List oneElementTest(Collection collection, int typeOfSort) {

            List controlList = startSort(collection, typeOfSort,null);
            return controlList;

    }

    public List emptyListTest(Collection collection, int typeOfSort) {

        List controlList = startSort(collection, typeOfSort,null);
        if (controlList.isEmpty()) {
            return null;
        }else {
            return controlList;
        }

    }

    public List reverseListTest(List listForSort, int typeOfSort) {

        List controlList = startSort(listForSort, typeOfSort, Comparator.reverseOrder());
        return controlList;

    }


}
