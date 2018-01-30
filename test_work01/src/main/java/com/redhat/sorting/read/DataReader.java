package com.redhat.sorting.read;

import java.io.IOException;

public interface DataReader {
    byte[] readData(String filePath) throws IOException;
}
