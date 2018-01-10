package com.redhat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SelectSorter <T extends Comparable<T>> implements BasicSorter {


    @Override
    public List sort(Collection collection) {
        return sort(collection, null);
    }

    public List sort(Collection collection, Comparator comparator) {
        List<T> mySortedList;
        mySortedList = (List<T>) collection.stream().collect(Collectors.toList());

        if (mySortedList.size() > 0) {
            T min;
            int number = 0;
            T swap;
            int j;

            for (int i = 0; i < mySortedList.size(); i++) {
                min = mySortedList.get(i);

                for (j = i + 1; j < mySortedList.size(); j++) {
                    int statement = (comparator == null ? min.compareTo(mySortedList.get(j)) :
                            comparator.compare(min, mySortedList.get(j)));
                    if (0 < statement) {
                        min = mySortedList.get(j);
                        number = j;
                    }
                }
                if (!min.equals(mySortedList.get(i))) {

                    swap = mySortedList.get(i);
                    mySortedList.set(i, min);
                    mySortedList.set(number, swap);
                }
            }
        }
        return mySortedList;

    }

}