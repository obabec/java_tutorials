package com.redhat;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    private static Collection<Comparable> numbersToSort = new ArrayList<>();
    private static BubbleSorter bubbleSortMaker = new BubbleSorter();
    private static InsertSorter insertSortMaker = new InsertSorter();
    private static SelectSorter selectSortMaker = new SelectSorter();

    private Boolean inputSwitch = false;

    public static void main(String[] args) {

        DataReader reader = new DataReader();

        numbersToSort = reader.checkSwitch(args);

        List sortedList = bubbleSortMaker.sort(numbersToSort);
        selectSortMaker.sort(numbersToSort);
        insertSortMaker.sort(numbersToSort);
        sortedList.forEach(System.out::println);
    }


}
