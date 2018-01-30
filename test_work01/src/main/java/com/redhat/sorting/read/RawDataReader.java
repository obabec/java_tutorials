package com.redhat.sorting.read;

import java.io.FileNotFoundException;

public class RawDataReader implements DataReader{
    @Override
    public byte[] readData(String filePath) throws FileNotFoundException {
        throw new RuntimeException();

    }
}
