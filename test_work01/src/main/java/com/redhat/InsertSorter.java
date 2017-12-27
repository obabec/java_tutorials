package com.redhat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InsertSorter <T extends Comparable<T>> implements BasicSorter {

    @Override
    public List sort(Collection collection) {
        List<T> mySortedList = new ArrayList<>();
        Iterator<T> integerIterator = collection.iterator();

        if (collection.isEmpty()) {
            return mySortedList;
        } else {
            while (integerIterator.hasNext()) {
                T iteratorCurrentValue = integerIterator.next();
                mySortedList.add(iteratorCurrentValue);
                int j = (mySortedList.size() - 1) - 1;
                while ((0 <= j) && (0 < mySortedList.get(j).compareTo(iteratorCurrentValue))) {
                    T swap = mySortedList.get(j);
                    mySortedList.set(j, iteratorCurrentValue);
                    mySortedList.set(j + 1, swap);
                    j--;
                }
            }

            return mySortedList;
        }


    }
}
