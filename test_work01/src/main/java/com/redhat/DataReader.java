package com.redhat;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class DataReader implements DataRead {

    @Override
    public Collection<Comparable> readData(String[] args) {
        Collection<Comparable> numbersToSort = new ArrayList<>();
        if (args[0].equals("-f")) {

            try {
                File fileWithContent = new File(args[0]);
                FileReader fileReader = new FileReader(fileWithContent);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    numbersToSort.add(Integer.parseInt(line));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Soubor nenalezen");
                return null;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }

        } else {
            for (int i = 0; i < args.length; i++) {
                numbersToSort.add(Integer.parseInt(args[i]));
            }
        }
        return numbersToSort;
    }

}
