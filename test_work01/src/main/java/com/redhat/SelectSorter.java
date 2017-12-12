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
            int number = 0;
            T swap;
            int j=0;

            for (int i=0;i<mySortedList.size();i++)
            {
                min = mySortedList.get(i);

                for (j = i+1;j<mySortedList.size();j++)
                {
                    if (0 < min.compareTo(mySortedList.get(j)))
                    {
                        min = mySortedList.get(j);
                        number = j;
                    }
                }
                if (!min.equals(mySortedList.get(i)))
                {

                    swap = mySortedList.get(i);
                    mySortedList.set(i,min);
                    mySortedList.set(number,swap);

                }

            }
        }
        return mySortedList;

    }
}
