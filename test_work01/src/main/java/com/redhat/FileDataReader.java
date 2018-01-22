package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class FileDataReader implements DataReader{

    private static final Logger LOGGER = LoggerFactory.getLogger(FileDataReader.class);

    @Override
    public Collection<Comparable> readData(String filePath) {
        Collection data = new ArrayList();
        LOGGER.info("File read started");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = null;
            while ((line = br.readLine()) != null){
                data.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
