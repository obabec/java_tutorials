package com.redhat.sorting.selectors.sort;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.sort.*;

public class SortSelectorImpl<T extends Comparable<T>> implements SortSelector {
    @Override
    public DataSorter selectSorter(CommadLineParser cmdParser) {

        DataSorter s = null;

        if (cmdParser.getAlgorithm() == "bubble") {

            switch (cmdParser.getDatatype()) {
                case "string":  s = new BubbleSorter<String>();
                    break;
                case "int": s = new BubbleSorter<Integer>();
                    break;
                default: throw new IllegalArgumentException();
            }

        } else if (cmdParser.getAlgorithm() == "select") {

            switch (cmdParser.getDatatype()) {
                case "string":  s = new SelectSorter<String>();
                    break;
                case "int": s = new SelectSorter<Integer>();
                    break;
                default: throw new IllegalArgumentException();
            }

        } else if (cmdParser.getAlgorithm() == "insert") {

            switch (cmdParser.getDatatype()) {
                case "string": s = new InsertSorter<String>();
                    break;
                case "int": s = new InsertSorter<Integer>();
                    break;
                default: throw new IllegalArgumentException();
            }

        } else if (cmdParser.getAlgorithm() == "quick") {

            switch (cmdParser.getDatatype()) {
                case "string": s = new QuickSorter<String>();
                    break;
                case "int": s = new QuickSorter<Integer>();
                    break;
                default: throw new IllegalArgumentException();
            }

        } else {
            throw new IllegalArgumentException();
        }
        return s;
    }
}
