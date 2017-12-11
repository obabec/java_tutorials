import com.redhat.Main;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SortTesterClass
{

    public Collection collection = new ArrayList();
    public List<Comparable> SortedNums = new ArrayList<>();
    private List<Comparable> controlList;

    public Boolean RandomIntTest(Integer typeOfTest)
    {
        collection.clear();


        InsertToCollection();


        controlList = (List<Comparable>) collection.stream().collect(Collectors.toList());

        Collections.sort(controlList);
        BasicSortFuncClass startSort = new BasicSortFuncClass(SortedNums,collection);
        startSort.StartSort(typeOfTest);


        return controlList.equals(startSort.getSortedNums());

    }

    public Boolean ReverseListTest(Integer typeOfTest)
    {
        collection.clear();
        InsertToCollection();
        controlList = (List<Comparable>) collection.stream().collect(Collectors.toList());

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

}
