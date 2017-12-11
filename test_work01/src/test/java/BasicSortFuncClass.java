import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class BasicSortFuncClass
{
    BubbleSorter bubbleSorter = new BubbleSorter();
    SelectSorter selectSorter = new SelectSorter();
    InsertSorter insertSorter = new InsertSorter();


    public Collection SortedNums = new ArrayList<>();
    public Collection collection = new ArrayList();

    public BasicSortFuncClass(List<Comparable> sortedNums, Collection collection)
    {
        SortedNums = sortedNums;
        this.collection = collection;
    }

    public Collection getSortedNums()
    {
        return SortedNums;
    }

    public void setSortedNums(List<Comparable> sortedNums)
    {
        SortedNums = sortedNums;
    }

    public Collection getCollection()
    {
        return collection;
    }

    public void setCollection(Collection collection)
    {
        this.collection = collection;
    }

    public void StartSort(Integer typeOfTest)
    {
        switch (typeOfTest)
        {
            case 0:
                SortedNums = bubbleSorter.sort(collection);
                break;
            case 1:
                SortedNums = selectSorter.sort(collection);
                break;
            default:
                SortedNums = insertSorter.sort(collection);
                break;
        }
    }
}
