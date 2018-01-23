package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static Collection<Comparable> numbersToSort = new ArrayList<>();
/*
    private static BubbleSorter bubbleSortMaker = new BubbleSorter();

    private static InsertSorter insertSortMaker = new InsertSorter();*/
    private static SelectSorter selectSortMaker = new SelectSorter();
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        LOGGER.warn("Started main");
        /*PlainFileDataReader fileReader = new PlainFileDataReader();*/
        JsonFileDataReader jsonFileDataReader = new JsonFileDataReader();
        if (jsonFileDataReader.readData(args[0]) == null){
            LOGGER.warn("Bad path or empty file");
        }else {
            numbersToSort = jsonFileDataReader.readData(args[0]);
            System.out.print(numbersToSort);
        }

        Comparator<Employee> c = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        };

        List<Employee> sortedList = selectSortMaker.sort(numbersToSort,c);
        sortedList.forEach(employee -> System.out.println(employee.getName() + " : " +employee.getBirthDate()));

    }
}
