package com.redhat.sorting.selectors.sort;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.sort.DataSorter;

public class SortSelection implements SortSelector {
    @Override
    public DataSorter selectSorter(CommadLineParser cmdParser) {
        throw new RuntimeException();
    }
}
