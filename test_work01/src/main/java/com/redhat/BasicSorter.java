package com.redhat;

import java.util.Collection;
import java.util.List;

public interface BasicSorter <T extends Comparable<T>>
{
List<T> sort(Collection<T> collection);
}