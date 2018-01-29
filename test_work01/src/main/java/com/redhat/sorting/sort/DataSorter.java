package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface DataSorter {
    List sort(Collection collection, Comparator comparator);
    List sort(Collection collection);
}
