package com.redhat;

import com.beust.jcommander.JCommander;
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
    private static QuickSorter quickSorter = new QuickSorter();
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.warn("Started main");
        Settings settings = new Settings();
        new JCommander(settings,args);

        DataReader fileDataReader;

        if (settings.isTypeOfContent()) {
             fileDataReader = new PlainFileDataReader();
            numbersToSort = fileDataReader.readData(settings.getPath());

            List sortedList = quickSorter.sort(numbersToSort,null);
            sortedList.forEach(System.out::println);

        } else {
             fileDataReader = new JsonFileDataReader();
            numbersToSort = fileDataReader.readData(settings.getPath());

            Comparator<Employee> c = new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o2.getBirthDate().compareTo(o1.getBirthDate());
                }
            };

            List<Employee> sortedList = quickSorter.sort(numbersToSort,c);
            sortedList.forEach(employee -> System.out.println(employee.getName() + " : " +employee.getBirthDate()));

        }

    }

}
