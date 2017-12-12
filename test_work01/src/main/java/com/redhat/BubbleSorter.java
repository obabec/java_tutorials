package com.redhat;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorter <T extends Comparable<T>> implements BasicSorter {

    public List<T> mySortedList;

    @Override
    public List sort(Collection collection)
    {
        mySortedList = (List<T>) collection.stream().collect(Collectors.toList());
        T transfer;
        for(int x = 0;x<mySortedList.size()-1;x++)
        {

            for(int y=1+x;y<mySortedList.size();y++)
            {
                if (1 == mySortedList.get(y).compareTo(mySortedList.get(x)))
                {
                    transfer =  mySortedList.get(x);
                    mySortedList.set(x, mySortedList.get(y));
                    mySortedList.set(y, transfer);

                }
            }
        }

        return mySortedList;
    }
}
