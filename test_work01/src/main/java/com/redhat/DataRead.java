package com.redhat;

import java.util.Collection;

public interface DataRead {

    Collection<Comparable> checkSwitch(String[] args);
    Collection<Comparable> readFromConsole(String[] data);
    Collection<Comparable> readFromFile(String filePath);
}
