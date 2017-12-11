import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.redhat.Main.sorter;

public class BasicSortFuncClass {
    public List<Integer> SortedNums = new ArrayList<>();
    public Collection collection = new ArrayList();

    public BasicSortFuncClass(List<Integer> sortedNums, Collection collection)
    {
        SortedNums = sortedNums;
        this.collection = collection;
    }

    public List<Integer> getSortedNums() {
        return SortedNums;
    }

    public void setSortedNums(List<Integer> sortedNums) {
        SortedNums = sortedNums;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public void StartSort(Integer typeOfTest)
    {
        switch (typeOfTest)
        {
            case 0:
                SortedNums = sorter.BubbleSort(collection);
                break;
            case 1:
                SortedNums = sorter.SelectSort(collection);
                break;
            default:
                SortedNums = sorter.InsertSort(collection);
                break;
        }
    }
}
