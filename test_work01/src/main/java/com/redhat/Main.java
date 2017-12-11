package com.redhat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main
{
    public static Collection<Comparable> numbersToSort = new ArrayList<>();
    public static Collection sortedColl = new ArrayList<>();


//    public static SortClass sorter = new SortClass();
    public static BubbleSorter bubbleSortMaker = new BubbleSorter();
    public static InsertSorter insertSortMaker = new InsertSorter();
    public static SelectSorter selectSortMaker = new SelectSorter();


    public static void main(String args[]) {

        for (int i = 0; i < args.length; i++)
        {
            numbersToSort.add(args[i]);
        }


        //listerino = sorter.BubbleSort(numbersToSort);
        //listerino = sorter.SelectSort(numbersToSort);
        //listerino = sorter.InsertSort(numbersToSort);
        //listerino.forEach(System.out::println);
        /*numbersToSort.add("a");
        numbersToSort.add("f");
        numbersToSort.add("x");
        numbersToSort.add("z");*/
        sortedColl = bubbleSortMaker.sort(numbersToSort);
        sortedColl = selectSortMaker.sort(numbersToSort);
        /*numbersToSort.clear();
        numbersToSort.add(80.00);
        numbersToSort.add(62.50);
        numbersToSort.add(71.1);*/
        sortedColl = insertSortMaker.sort(numbersToSort);
    }




    public static boolean tryParse(String input)
    {
        try
        {
            Integer.parseInt(input);
            return true;
        }
            catch (NumberFormatException e)
        {
            return false;
        }

    }
}
