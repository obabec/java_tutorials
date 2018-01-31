package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorter<T extends Comparable<T>> implements DataSorter<T>{
    @Override
    public List<T> sort(Collection<T> collection, Comparator<T> comparator) {

        List<T> mySortedList = collection.stream().collect(Collectors.toList());
        T transfer;

        for (int x = 0; x < mySortedList.size() - 1; x++) {
            for (int y = 1 + x; y < mySortedList.size(); y++) {

                int state = (comparator == null ? mySortedList.get(x).compareTo(mySortedList.get(y)) :
                        comparator.compare(mySortedList.get(y), mySortedList.get(x)));

                if (0 < state) {
                    transfer = mySortedList.get(x);
                    mySortedList.set(x, mySortedList.get(y));
                    mySortedList.set(y, transfer);
                }
            }
        }
        if (collection.isEmpty()) {
            return null;
        } else {
            return mySortedList;
        }
    }

    @Override
    public List<T> sort(Collection<T> collection) {
        return sort(collection, null);
    }
}
