package com.redhat.sorting.selectors.sort;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.sort.*;

public class SortSelectorImpl<T extends Comparable<T>> implements SortSelector {
    @Override
    public DataSorter selectSorter(CommadLineParser cmdParser) {

        DataSorter s = null;

        if (cmdParser.getAlgorithm().contains("bubble")) {
               s = selectBubble(cmdParser);

        } else if (cmdParser.getAlgorithm().contains("select")) {

                s = selectSelect(cmdParser);

        } else if (cmdParser.getAlgorithm().contains("insert")) {

                s = selectInsert(cmdParser);

        } else if (cmdParser.getAlgorithm().contains("quick")) {

                s = selectQuick(cmdParser);
        } else {
            throw new IllegalArgumentException();
        }
        return s;
    }
    public DataSorter selectBubble(CommadLineParser commadLineParser) {
        DataSorter s = null;
        switch (commadLineParser.getDatatype()) {
            case "string":  s = new BubbleSorter<String>();
                break;
            case "int": s = new BubbleSorter<Integer>();
                break;
            default: throw new IllegalArgumentException();
        }
        return s;
    }

    public DataSorter selectSelect(CommadLineParser commadLineParser) {
        DataSorter s = null;
        switch (commadLineParser.getDatatype()) {
            case "string":  s = new SelectSorter<String>();
                break;
            case "int": s = new SelectSorter<Integer>();
                break;
            default: throw new IllegalArgumentException();
        }
        return s;
    }

    public DataSorter selectInsert(CommadLineParser commadLineParser) {

        switch (commadLineParser.getDatatype()) {
            case "string": DataSorter<String> s = new InsertSorter<String>();
                break;
            case "int": DataSorter<Integer> s = new InsertSorter<Integer>();
                break;
            default: throw new IllegalArgumentException();
        }
        return s;
    }

    public DataSorter selectQuick(CommadLineParser commadLineParser) {
        DataSorter s = null;
        switch (commadLineParser.getDatatype()) {
            case "string": s = new QuickSorter<String>();
                break;
            case "int": s = new QuickSorter<Integer>();
                break;
            default: throw new IllegalArgumentException();
        }
        return s;

    }




}
