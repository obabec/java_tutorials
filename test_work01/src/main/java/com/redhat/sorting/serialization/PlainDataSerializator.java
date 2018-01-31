package com.redhat.sorting.serialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlainDataSerializator implements Serializator{
    @Override
    public String serialize(Collection collection) {

        if (collection == null || collection.isEmpty()){
            return null;
        } else {
            List wList = new ArrayList(collection);
            String str = wList.get(0).toString();

            for (int i = 1; i< wList.size();i++ ) {
                str = str + ", " + wList.get(i);
            }
        return str;
        }

    }
}
