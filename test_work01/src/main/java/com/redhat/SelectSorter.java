package com.redhat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SelectSorter <T extends Comparable<T>> implements BasicSorter {

    public List<T> mySortedList;

    @Override
    public List sort(Collection collection)
    {
        mySortedList = (List<T>) collection.stream().collect(Collectors.toList());

        if (mySortedList.size()>0)
        {
            T min;
            T swap;

            for (int i=0;i<mySortedList.size();i++)
            {
                min = mySortedList.get(i);

                for (int j = i+1;j<mySortedList.size();j++)
                {
                    if (0 > mySortedList.get(i).compareTo(mySortedList.get(j)))
                    {
                        min = mySortedList.get(j);
                    }
                }

            }
        }
        return mySortedList;

    }
}
