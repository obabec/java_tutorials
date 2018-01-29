package com.redhat.sorting.parse;

import java.util.List;

public interface DataParser {

    List parseData(byte[] data);
}
