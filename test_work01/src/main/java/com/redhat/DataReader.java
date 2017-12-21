package com.redhat;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class DataReader implements DataRead {

    @Override
    public Collection<Comparable> checkSwitch(String[] args) {
        if (args[0].equals("-f")){
            return readFromFile(args[1]);
        }
        else {
            return readFromConsole(args);
        }

    }

    @Override
    public Collection<Comparable> readFromConsole(String[] data) {
        Collection<Comparable> numbersToSort = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            numbersToSort.add(data[i]);
        }
        return numbersToSort;
    }

    @Override
    public Collection<Comparable> readFromFile(String filePath) {

        try {
            File fileWithContent = new File(filePath);
            FileReader fileReader = new FileReader(fileWithContent);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            Collection<Comparable> numbersToSort = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                numbersToSort.add(Integer.parseInt(line));
            }
            return numbersToSort;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Soubor nenalezen");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
