package com.redhat;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main
{
    public static Collection<Comparable> numbersToSort = new ArrayList<>();

    public static BubbleSorter bubbleSortMaker = new BubbleSorter();
    public static InsertSorter insertSortMaker = new InsertSorter();
    public static SelectSorter selectSortMaker = new SelectSorter();

    Boolean inputSwitch = false;

    public static void main(String args[])
    {


        if (args[0].equals("f"))
        {

            try
            {
                File fileWithContent = new File(args[1]);


                FileReader fileReader = new FileReader(fileWithContent);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;

                while ((line = bufferedReader.readLine()) != null)
                {
				numbersToSort.add(Integer.parseInt(line));
			    }


            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
                System.out.println("Soubor nenalezen");

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        }

        else
        {
            for (int i = 0; i < args.length; i++)
            {
                numbersToSort.add(args[i]);
            }

        }

        List sortedList =  bubbleSortMaker.sort(numbersToSort);
        selectSortMaker.sort(numbersToSort);
        insertSortMaker.sort(numbersToSort);

        sortedList.forEach(System.out::println);


    }


}
