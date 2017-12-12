package com.redhat;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorter implements BasicSorter {

    @Override
    public List sort(Collection collection)
    {
        List<? extends Comparable> mySortedList;

        mySortedList = (List<? extends Comparable>) collection.stream().collect(Collectors.toList());

        Comparable transfer;
        for(int x = 0;x<mySortedList.size()-1;x++)
        {

            for(int y=1+x;y<mySortedList.size();y++)
            {
                if (1 == mySortedList.get(x).compareTo(mySortedList.get(y)))
                {
                    transfer = (Comparable) mySortedList.get(x);
                    mySortedList.set(x, mySortedList.get(y));
                    mySortedList.set(y, );

                }
            }
        }

        return mySortedList;
    }
}
