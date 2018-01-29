package com.redhat.sorting.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SelectSorter implements DataSorter {
    @Override
    public List sort(Collection collection, Comparator comparator) {
        return null;
    }

    @Override
    public List sort(Collection collection) {
        return sort(collection, null);
    }
}
