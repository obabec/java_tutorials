package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface DataSorter<T extends Comparable<T>> {
    List<T> sort(Collection<T> collection, Comparator<T> comparator);
    List<T> sort(Collection<T> collection);
}
