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

        List<Integer> listerino = new ArrayList<>();
        /*for (int i = 0; i < args.length; i++)
        {
            if (tryParse(args[i]))
            {
                numbersToSort.add(Integer.parseInt(args[i]));
            }
        }*/
        numbersToSort.add(50);
        numbersToSort.add(2);
        numbersToSort.add(5);
        numbersToSort.add(180);
        numbersToSort.add(120);


        listerino = sorter.BubbleSort(numbersToSort);
        listerino = sorter.SelectSort(numbersToSort);
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
