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
    private static SelectSorter selectSortMaker = new SelectSorter();
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.warn("Started main");

        Settings settings = new Settings();
        new JCommander(settings,args);


        if (settings.isTypeOfContent()) {
            PlainFileDataReader fileReader = new PlainFileDataReader();
            if (fileReader.readData(settings.getPath()) == null){
                LOGGER.warn("Bad path or empty file");
            }else {
                numbersToSort = fileReader.readData(settings.getPath());
            }
            List sortedList = selectSortMaker.sort(numbersToSort,null);
            sortedList.forEach(System.out::println);
        } else {
            JsonFileDataReader fileReader = new JsonFileDataReader();
            if (fileReader.readData(settings.getPath()) == null){
                LOGGER.warn("Bad path or empty file");
            }else {
                numbersToSort = fileReader.readData(settings.getPath());
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


}
