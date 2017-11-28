package com.redhat;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static List<Integer> numbersToSort = new ArrayList<>();


    public static void main(String args[])
    {
        Integer[] a = new Integer[args.length];

        for (int i = 0; i < args.length; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }

      numbersToSort = Arrays.asList(a);
        bubble();
    }



    public static void bubble()
    {
        int transfer = 0;
        for(int x = 0;x<numbersToSort.size();x++)
        {
            for(int y=0;y<numbersToSort.size();y++)
            {
                    if (numbersToSort.get(x)>numbersToSort.get(y))
                    {
                        transfer = numbersToSort.get(x);
                        numbersToSort.set(x, numbersToSort.get(y));
                        numbersToSort.set(y, transfer);
                    }
            }
        }

        numbersToSort.forEach(System.out::println);
    }
}
