package com.redhat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InsertSorter implements BasicSorter {
    @Override
    public Collection sort(Collection<Comparable> collection)
    {


        List<Comparable> mySortedList = new ArrayList<>();
        Iterator<Comparable> integerIterator = collection.iterator();


        for (int i=0;integerIterator.hasNext();i++)
        {
            if (i == 0)
            {
                mySortedList.add(integerIterator.next());

            }
            else
            {
                Comparable pom = integerIterator.next();
                int j = i - 1 ;

                while ((j>=0)&&(1 ==mySortedList.get(j).compareTo(pom)))
                {
                    if (mySortedList.size()<=j+1)
                    {
                        mySortedList.add(j+1,mySortedList.get(j));
                    }
                    else
                    {
                        mySortedList.set(j+1,mySortedList.get(j));
                    }

                    j--;
                }
                if (mySortedList.size()>j+1)
                {
                    mySortedList.set(j+1,pom);
                }
                else
                {
                    mySortedList.add(j+1,pom);
                }


            }

        }






        return mySortedList;

    }
}