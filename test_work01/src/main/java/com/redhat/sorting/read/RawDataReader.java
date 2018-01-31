package com.redhat.sorting.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RawDataReader implements DataReader{
    @Override
    public List readData(String filePath) throws FileNotFoundException {

        List readedData = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = null;
            while ((line = br.readLine()) != null){
                readedData.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (readedData.isEmpty()) {
            return null;
        } else {
            return readedData;
        }

    }
}
