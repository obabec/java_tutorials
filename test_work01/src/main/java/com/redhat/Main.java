package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    private static Collection<Comparable> numbersToSort = new ArrayList<>();
    private static BubbleSorter bubbleSortMaker = new BubbleSorter();
//    private static InsertSorter insertSortMaker = new InsertSorter();
//    private static SelectSorter selectSortMaker = new SelectSorter();
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        LOGGER.warn("Started main");
        FileDataReader reader = new FileDataReader();
        if (reader.readData(args[0]) == null){
            LOGGER.warn("Bad path or empty file");
        }else {
            numbersToSort = reader.readData(args[0]);
        }


        List sortedList = bubbleSortMaker.sort(numbersToSort);
        sortedList.forEach(System.out::println);
    }
}
