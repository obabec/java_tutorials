package com.redhat.sorting.parse;

import java.util.List;

public class PlainDataParser implements DataParser{
    @Override
    public List parseData(byte[] data) {
        throw new RuntimeException();
    }
}
