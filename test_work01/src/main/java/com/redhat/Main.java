package com.redhat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    private static Collection<Comparable> numbersToSort = new ArrayList<>();
    private static BubbleSorter bubbleSortMaker = new BubbleSorter();
    private static InsertSorter insertSortMaker = new InsertSorter();
    private static SelectSorter selectSortMaker = new SelectSorter();

    public static void main(String[] args) {

        DataReader reader = new DataReader();

        numbersToSort = reader.checkSwitch(args);
        /*
        Cely kod by se dal rozsirit o Comparator, ktery by vyresil uskali Comparable a to jsou objekty,
        tudiz by se jen z obejktu vybraly atributy, ktere jsou typu Comparable a pomoci nektere z nich
        by se nasledne array mohl setridit...

        */
        List sortedList = insertSortMaker.sort(numbersToSort);
        sortedList.forEach(System.out::println);
    }


}
