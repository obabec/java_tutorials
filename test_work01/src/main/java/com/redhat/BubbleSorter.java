package com.redhat;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorter implements BasicSorter {

    @Override
    public Collection<Comparable> sort(Collection<Comparable> collection) {
        List<Comparable> mySortedList;

        mySortedList = collection.stream().collect(Collectors.toList());

        Comparable transfer = 0;
        for(int x = 0;x<mySortedList.size();x++)
        {
            for(int y=0;y<mySortedList.size();y++)
            {
                if (1 == mySortedList.get(y).compareTo(mySortedList.get(x)))
                {
                    transfer = mySortedList.get(x);
                    mySortedList.set(x, mySortedList.get(y));
                    mySortedList.set(y, transfer);
                }
            }
        }


        return mySortedList;
    }
}
