package com.redhat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortClass {

    public List<Integer> BubbleSort(Collection collection)
    {
        List<Integer> mySortedList;

        mySortedList = (List<Integer>) collection.stream().collect(Collectors.toList());

        int transfer = 0;
        for(int x = 0;x<mySortedList.size();x++)
        {
            for(int y=0;y<mySortedList.size();y++)
            {
                if (mySortedList.get(x)<mySortedList.get(y))
                {
                    transfer = mySortedList.get(x);
                    mySortedList.set(x, mySortedList.get(y));
                    mySortedList.set(y, transfer);
                }
            }
        }


        return mySortedList;
    }


    public List<Integer> SelectSort(Collection collection)
    {

        List<Integer> mySortedList;
        mySortedList = (List<Integer>) collection.stream().collect(Collectors.toList());

        if (mySortedList.size()>0)
        {
            int min = 0;
            int swap = 0;

            for (int i=0;i<mySortedList.size();i++)
            {


                for (int j = i+1;j<mySortedList.size();j++)
                {
                    if (mySortedList.get(i)>mySortedList.get(j))
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


    public List<Integer> InsertSort(Collection collection)
    {
        List<Integer> mySortedList = new ArrayList<>();

        return mySortedList;
    }

}
