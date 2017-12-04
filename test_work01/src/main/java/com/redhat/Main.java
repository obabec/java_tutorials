package com.redhat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main
{
    public static Collection<Integer> numbersToSort = new ArrayList<>();

    public static SortClass sorter = new SortClass();


    public static void main(String args[]) {

        List<Integer> listerino;
        for (int i = 0; i < args.length; i++)
        {
            if (tryParse(args[i]))
            {
                numbersToSort.add(Integer.parseInt(args[i]));
            }
        }

        /*numbersToSort.add(5);
        numbersToSort.add(185);
        numbersToSort.add(66);
        numbersToSort.add(55);
        numbersToSort.add(99);
        numbersToSort.add(845);
        numbersToSort.add(155);*/


        //listerino = sorter.BubbleSort(numbersToSort);
        //listerino = sorter.SelectSort(numbersToSort);
        listerino = sorter.InsertSort(numbersToSort);
        listerino.forEach(System.out::println);
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
