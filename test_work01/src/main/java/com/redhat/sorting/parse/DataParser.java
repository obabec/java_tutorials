package com.redhat.sorting.parse;

import java.util.List;

public interface DataParser<T extends Comparable<T>> {

    List<T> parseData(List data);
}
