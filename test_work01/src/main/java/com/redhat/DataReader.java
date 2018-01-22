package com.redhat;

import java.util.Collection;

public interface DataReader {
    Collection<Comparable> readData(String filePath);
}
