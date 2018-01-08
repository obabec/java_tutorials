import com.redhat.BubbleSorter;
import com.redhat.InsertSorter;
import com.redhat.SelectSorter;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFuncTests implements SortInterface {
    @Override
    public List startSort(Collection collection, Integer typeOfSort, Comparator comparator) {
        List returnList;
        switch (typeOfSort) {
            case 0:
                BubbleSorter bubbleSorterino = new BubbleSorter();
                returnList = bubbleSorterino.sort(collection, comparator);
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

        /*for (int i = 0;i < 15;i++) {
            collectionOfNumbers.add(rand.nextInt());
        }*/
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Person pavel = new Person("Pavel","Reh",15);
        Person honza = new Person("Jan","Reh",15);
        Person petr = new Person("Petr","Reh",15);

        collectionOfNumbers.add(pavel);
        collectionOfNumbers.add(honza);
        collectionOfNumbers.add(petr);

        List<Person> listForSort;
        listForSort = (List) collectionOfNumbers.stream().collect(Collectors.toList());
        Collections.sort(listForSort,comparator);

        List controlList = new ArrayList<>();

        for(int j = 0;j < 1;j++) {
            controlList = startSort(collectionOfNumbers, j,comparator);
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
