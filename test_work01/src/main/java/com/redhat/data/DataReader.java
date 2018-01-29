package com.redhat.data;

import java.util.Collection;

public interface DataReader {
    Collection readData(String filePath);
}
