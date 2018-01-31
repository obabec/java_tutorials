package com.redhat.sorting.read;

import java.io.IOException;
import java.util.List;

public interface DataReader {
    List readData(String filePath) throws IOException;
}
