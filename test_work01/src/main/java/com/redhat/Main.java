package com.redhat;

import com.beust.jcommander.JCommander;
import com.redhat.cmd.CommandLineSettings;
import com.redhat.data.DataReader;
import com.redhat.data.JsonFileDataReader;
import com.redhat.data.PlainFileDataReader;
import com.redhat.sorts.BasicSorter;
import com.redhat.sorts.QuickSorter;
import com.redhat.utils.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {



    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Collection numbersToSort;

        BasicSorter sorter;
        sorter = new QuickSorter();
        LOGGER.info("Started main");
        CommandLineSettings settings = new CommandLineSettings();
        JCommander.newBuilder().addObject(settings).build().parse(args);

        DataReader fileDataReader;

        if (settings.isTypeOfContent()) {

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
