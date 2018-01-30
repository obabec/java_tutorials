package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SelectSorter implements DataSorter {
    @Override
    public List sort(Collection collection, Comparator comparator) {
        throw new RuntimeException();
    }

    @Override
    public List sort(Collection collection) {
        return sort(collection, null);
    }
}
