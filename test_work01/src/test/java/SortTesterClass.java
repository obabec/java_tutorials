import com.redhat.Main;
import com.redhat.SortClass;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SortTesterClass
{

    public Collection collection = new ArrayList();
    public SortClass sorter = new SortClass();
    public List<Integer> SortedNums = new ArrayList<>();
    private List<Integer> controlList;

    public Boolean RandomIntTest(Integer typeOfTest)
    {
        collection.clear();


        InsertToCollection();


        controlList = (List<Integer>) collection.stream().collect(Collectors.toList());

        Collections.sort(controlList);
        BasicSortFuncClass startSort = new BasicSortFuncClass(SortedNums,collection);
        startSort.StartSort(typeOfTest);


        return controlList.equals(startSort.getSortedNums());

    }

    public Boolean ReverseListTest(Integer typeOfTest)
    {
        collection.clear();
        InsertToCollection();
        controlList = (List<Integer>) collection.stream().collect(Collectors.toList());

        Collections.sort(controlList);
        Collections.reverse(controlList);
        collection.clear();

        for (int i = 0;i<controlList.size();i++)
        {
            collection.add(controlList.get(i));
        }
        BasicSortFuncClass startSort = new BasicSortFuncClass(SortedNums,collection);

        startSort.StartSort(typeOfTest);

        Collections.reverse(controlList);
        return controlList.equals(startSort.getSortedNums());
    }

    public void InsertToCollection()
    {
        Random rand = new Random();

        for (int i=0;i<rand.nextInt(Integer.SIZE-1);i++)
        {
            collection.add(rand.nextInt());
        }

    }





   /* public void StartSort(Integer typeOfTest)
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
    }*/

}
