package com.redhat.sorting.read;

import java.nio.file.Path;

public interface DataReader {
    //Two options here: 1) return byte[] 2)return Collection, same with path 1) String 2) nio.file.Path
    byte[] readData(Path filePath);
}
