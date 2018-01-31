package com.redhat.sorting.output;

public class SortedDataWriter implements DataWriter{
    @Override
    public void writeData(String data) {

        System.out.println(data);
    }
}
