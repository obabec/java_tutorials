package com.redhat.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.utils.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JsonFileDataReader implements DataReader{

    @Override
    public Collection readData(String filePath) {

        List<Employee> employees = new ArrayList<Employee>();
        Path jsonFilePath = Paths.get(filePath);
        try {
            byte[] jsonData = Files.readAllBytes(jsonFilePath);

            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Employee>> typeOfList = new TypeReference<List<Employee>>(){};
            employees = objectMapper.readValue(jsonData,typeOfList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;

    }

}
