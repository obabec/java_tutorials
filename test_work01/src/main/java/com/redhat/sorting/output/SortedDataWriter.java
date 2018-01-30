package com.redhat.sorting.output;

import java.util.Collection;

public class PlainDataWriter implements DataWriter{
    @Override
    public void writeData(Collection collection) {
        throw new RuntimeException();
    }
}
