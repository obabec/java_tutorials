package com.redhat;


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorter <T extends Comparable<? super T>> implements BasicSorter {

    @Override
    public List sort(Collection collection){
        return sort(collection,null);
    }


    public List sort(Collection collection, Comparator comparator) {

                List<T> mySortedList = (List<T>) collection.stream().collect(Collectors.toList());
                T transfer;

                for (int x = 0; x < mySortedList.size() - 1; x++) {
                    for (int y = 1 + x; y < mySortedList.size(); y++) {

                        int state = (comparator == null ? mySortedList.get(x).compareTo(mySortedList.get(y)) :
                                comparator.compare(mySortedList.get(x),mySortedList.get(y)));
                        if (0 > state) {
                            transfer = mySortedList.get(x);
                            mySortedList.set(x, mySortedList.get(y));
                            mySortedList.set(y, transfer);
                        }

                    }
                }
                return mySortedList;

    }



}


