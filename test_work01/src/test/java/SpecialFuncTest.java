import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SpecialFuncTest implements SortInterface{
    @Override
    public List startSort(Collection collection, Integer typeOfSort)
    {


        List returnList;
        switch (typeOfSort)
        {
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

    public boolean oneElementTest()
    {
        Collection collectionOfNumbers = new ArrayList();
        Integer chybovostSortovani=0;

        collectionOfNumbers.add("a");

        List listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());

        for(int j=0;j<3;j++)
        {
            List controlList = startSort(collectionOfNumbers, j);
            if (!listForSort.equals(controlList))
            {
                chybovostSortovani++;
            }
        }

        if (chybovostSortovani == 0)
        {
            return true;

        }
        else
        {
            return false;
        }


    }


}
