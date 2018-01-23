package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class PlainFileDataReader implements DataReader{

    private static final Logger LOGGER = LoggerFactory.getLogger(PlainFileDataReader.class);

    @Override
    public Collection readData(String filePath) {
        Collection data = new ArrayList();
        LOGGER.info("File read started");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = null;
            while ((line = br.readLine()) != null){
                data.add(line);
            }

        } catch (FileNotFoundException e) {
            LOGGER.warn("Bad file path!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.warn("Bad file path!");
        }

        if (data.isEmpty()){
            return null;
        }else {
            return data;
        }

    }
}
