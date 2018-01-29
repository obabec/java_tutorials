package com.redhat.sorting.selectors.sort;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.sort.DataSorter;

public interface SortSelector {
    DataSorter selectSorter(CommadLineParser cmdParser);
}
