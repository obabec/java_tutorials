package com.redhat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SelectSorter implements BasicSorter {
    @Override
    public Collection sort(Collection<Comparable> collection)
    {
        List<Comparable> mySortedList;
        mySortedList = collection.stream().collect(Collectors.toList());

        if (mySortedList.size()>0)
        {
            Comparable min = 0;
            Comparable swap = 0;

            for (int i=0;i<mySortedList.size();i++)
            {


                for (int j = i+1;j<mySortedList.size();j++)
                {
                    if (1 == mySortedList.get(i).compareTo(mySortedList.get(j)))
                    {
                        swap = mySortedList.get(i);
                        mySortedList.set(i,mySortedList.get(j));
                        mySortedList.set(j,swap);
                    }
                }

            }
        }






        return mySortedList;


    }
}
