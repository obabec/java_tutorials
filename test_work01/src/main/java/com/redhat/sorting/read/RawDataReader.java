package com.redhat.sorting.read;

import java.nio.file.Path;

public class RawDataReader implements DataReader{
    @Override
    public byte[] readData(Path filePath) {
        throw new RuntimeException();
    }
}
