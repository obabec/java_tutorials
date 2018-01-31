package com.redhat.sorting.read;

import com.redhat.sorting.cmd.CommadLineParser;

import java.util.List;

public interface DataReader {
    List readData(CommadLineParser cmdParser);
}
