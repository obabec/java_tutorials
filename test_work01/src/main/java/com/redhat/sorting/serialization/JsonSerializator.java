package com.redhat.sorting.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collection;

public class JsonSerializator implements Serializator{
    @Override
    public String serialize(Collection collection) {

        if (collection == null || collection.isEmpty()) {
            return null;
        } else {
            ObjectMapper objectMapper = new ObjectMapper();
            String str = null;
            try {
                str = objectMapper.writeValueAsString(collection);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}
