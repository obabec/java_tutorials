package com.redhat.sorting.serialization;

import java.util.Collection;

public interface Serializator<T extends Comparable<T>> {
    String serialize(Collection<T> collection);
}
