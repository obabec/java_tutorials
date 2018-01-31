package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSorter<T extends Comparable<T>> implements DataSorter<T>{

    private List<T> numbersForSort;

    @Override
    public List<T> sort(Collection<T> collection, Comparator<T> comparator) {
        numbersForSort = (List<T>) collection.stream().collect(Collectors.toList());

        recursiveSort(0, numbersForSort.size() - 1, comparator);
        if (collection.isEmpty()) {
            return null;
        } else {
            return numbersForSort;
        }
    }

    @Override
    public List<T> sort(Collection<T> collection) {
        return sort(collection, null);
    }

    public void recursiveSort(int startIndex, int lastIndex,Comparator comparator) {

        if (startIndex < lastIndex) {

            int pi = partiton(comparator,startIndex,lastIndex);

            recursiveSort(startIndex, pi-1, comparator);
            recursiveSort(pi+1, lastIndex, comparator);
        }


    }

    public int partiton(Comparator comparator, int first, int last){

        int i = (first - 1);
        T pivot = numbersForSort.get(last);

        for (int j = first; j<last; j++){

            if (0 <= stateOfComparing(comparator,numbersForSort.get(j),pivot) ){

                i++;
                swap(i, j);
            }

        }

        swap(i + 1, last);
        return i + 1;

    }

    private int stateOfComparing(Comparator comparator, T currentValue, T pivot){

        if (comparator == null) {
            return pivot.compareTo(currentValue);
        } else {
            return comparator.compare(pivot, currentValue);
        }

    }

    public void swap(int firstPos, int secondPos) {

        T tempVal;

        tempVal = numbersForSort.get(firstPos);
        numbersForSort.set(firstPos, numbersForSort.get(secondPos));
        numbersForSort.set(secondPos, tempVal);

    }
}
