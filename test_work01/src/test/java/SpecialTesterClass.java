

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialTesterClass
{

    public Collection collection = new ArrayList();
    public List<Comparable> SortedNums = new ArrayList<>();
    private List<Comparable> controlList;

    class Sorter {
        List<? extends Comparable> sort(Collection<? extends Comparable> col) {
            return null;
        }
    };


    public Boolean OneElementTest(Integer typeOfTest)
    {

        collection.clear();
        SortedNums.clear();

        collection.add("a");

        controlList = (List<Comparable>) collection.stream().collect(Collectors.toList());
        BasicSortFuncClass startSort = new BasicSortFuncClass(SortedNums,collection);

        startSort.StartSort(typeOfTest);

        Collections.sort(controlList);
        return controlList.equals(startSort.getSortedNums());

    }

    public Boolean EmptyCollectionTest(Integer typeOfTest) {
        SortedNums.clear();
        collection.clear();


        controlList = (List<Comparable>) collection.stream().collect(Collectors.toList());
        BasicSortFuncClass startSort = new BasicSortFuncClass(SortedNums,collection);
        startSort.StartSort(typeOfTest);

        Collections.sort(controlList);
        return controlList.equals(startSort.getSortedNums());

    }


}
