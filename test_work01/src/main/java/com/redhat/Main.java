package com.redhat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main
{
    public static Collection<Comparable> numbersToSort = new ArrayList<>();
    public static Collection sortedColl = new ArrayList<>();

    public static List<Integer> toSort = new ArrayList<>();


    public static BubbleSorter bubbleSortMaker = new BubbleSorter();
    public static InsertSorter insertSortMaker = new InsertSorter();
    public static SelectSorter selectSortMaker = new SelectSorter();


    public static void main(String args[]) {

        toSort.add(1);
        toSort.add(155);
        toSort.add(8);
        toSort.add(2);

        for (int i = 0; i < args.length; i++)
        {
            numbersToSort.add(args[i]);
        }

        List<String> wtfSorte = new ArrayList<>();


        wtfSorte.add("z");
        wtfSorte.add("a");
        wtfSorte.add("x");
        wtfSorte.add("f");


        sortedColl = selectSortMaker.sort(wtfSorte);

        numbersToSort.clear();
        numbersToSort.add(80.00);
        numbersToSort.add(62.50);
        numbersToSort.add(71.1);
        sortedColl = bubbleSortMaker.sort(numbersToSort);
        sortedColl = insertSortMaker.sort(numbersToSort);
    }


}
