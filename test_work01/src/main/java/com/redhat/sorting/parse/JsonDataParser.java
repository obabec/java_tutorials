package com.redhat.sorting.parse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.utils.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonDataParser implements DataParser{
    @Override
    public List parseData(List data) {

        if (data == null) {
            return null;
        } else {
            String str = "";
            for (int i = 0; i < data.size(); i++) {
                str = str + data.get(i);
            }

            byte[] jsonData = str.getBytes();
            List<Employee> employees = new ArrayList<>();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            TypeReference<List<Employee>> typeOfList = new TypeReference<List<Employee>>() {
            };

            try {
                employees = objectMapper.readValue(jsonData, typeOfList);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return employees;
        }
    }
}
