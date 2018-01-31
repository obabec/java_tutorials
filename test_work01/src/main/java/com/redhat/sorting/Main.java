package com.redhat.sorting;

import com.beust.jcommander.JCommander;
import com.redhat.data.DataReader;
import com.redhat.data.JsonFileDataReader;
import com.redhat.data.PlainFileDataReader;
import com.redhat.sorting.sort.DataSorter;
import com.redhat.sorting.sort.QuickSorter;
import com.redhat.sorting.utils.Employee;
import com.redhat.sorting.cmd.CommadLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Collection numbersToSort;

        DataSorter sorter;
        sorter = new QuickSorter();
        LOGGER.info("Started main");
        CommadLineParser cmdParser = new CommadLineParser();
        JCommander.newBuilder().addObject(cmdParser).build().parse(args);

        DataReader fileDataReader;

        if (cmdParser.is) {

            LOGGER.info("Plain text sorting");
            fileDataReader = new PlainFileDataReader();
            numbersToSort = fileDataReader.readData(settings.getPath());
            List sortedList = sorter.sort(numbersToSort, (settings.isSortOrder()?Collections.reverseOrder():null));
            sortedList.forEach(System.out::println);

        } else {
            LOGGER.info("JSON data sorting");
            fileDataReader = new JsonFileDataReader();
            numbersToSort = fileDataReader.readData(settings.getPath());

            Comparator<Employee> c = new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o2.getBirthDate().compareTo(o1.getBirthDate());
                }
            };

            List<Employee> sortedList = sorter.sort(numbersToSort,(settings.isSortOrder()?c.reversed():c));
            sortedList.forEach(employee -> System.out.println(employee.getName() + " : " +employee.getBirthDate()));
        }
    }
}
