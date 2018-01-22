package com.redhat;

import java.util.*;

public class InsertSorter <T extends Comparable<T>> implements BasicSorter {

    @Override
    public List sort(Collection collection) {

        return sort(collection,null);
    }

    @Override
    public List sort(Collection collection,Comparator comparator) {
        List<T> mySortedList = new ArrayList<>();
        Iterator<T> integerIterator = collection.iterator();

        if (collection.isEmpty()) {
            return mySortedList;
        } else {
            while (integerIterator.hasNext()) {
                T iteratorCurrentValue = integerIterator.next();
                mySortedList.add(iteratorCurrentValue);
                int j = (mySortedList.size() - 1) - 1;

                while ((0 <= j) && 0 < verifyComparator(comparator,mySortedList,iteratorCurrentValue,j)) {

                    T swap = mySortedList.get(j);
                    mySortedList.set(j, iteratorCurrentValue);
                    mySortedList.set(j + 1, swap);
                    j--;
                }

                }
            }

            return mySortedList;
        }

    private int verifyComparator(Comparator comparator,List<T> mySortedList,T iteratorCurrent,int position){
        if (comparator == null){
            return mySortedList.get(position).compareTo(iteratorCurrent);
        }else {
            return comparator.compare(mySortedList.get(position),iteratorCurrent);
        }

    }
    }