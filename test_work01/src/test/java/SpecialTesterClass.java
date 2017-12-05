import com.redhat.SortClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialTesterClass {

    public Collection collection = new ArrayList();
    public SortClass sorter = new SortClass();
    public List<Integer> SortedNums = new ArrayList<>();
    private List<Integer> controlList;

    public Boolean OneElementTest(Integer typeOfTest) {

        collection.clear();
        SortedNums.clear();

        collection.add(1);

        controlList = (List<Integer>) collection.stream().collect(Collectors.toList());
        StartSort(typeOfTest);

        Collections.sort(controlList);
        return controlList.equals(SortedNums);

    }
    public Boolean EmptyCollectionTest(Integer typeOfTest) {
        SortedNums.clear();
        collection.clear();


        controlList = (List<Integer>) collection.stream().collect(Collectors.toList());
        StartSort(typeOfTest);

        Collections.sort(controlList);
        return controlList.equals(SortedNums);

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
