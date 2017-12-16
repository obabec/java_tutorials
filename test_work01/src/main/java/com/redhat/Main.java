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

    public static Object osoba;
    public static List<Object> listerinoOsobino = new ArrayList<>();
    public static void main(String args[])
    {



        for (int i = 0; i < args.length; i++)
        {
            numbersToSort.add(args[i]);
        }

        bubbleSortMaker.sort(numbersToSort);
        selectSortMaker.sort(numbersToSort);
        insertSortMaker.sort(numbersToSort);

    }


}
