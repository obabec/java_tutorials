package com.redhat.sorting.selectors.serialize;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.serialization.Serializator;

public interface SerializatorSelector {
    Serializator selectSelizator(CommadLineParser commadLineParser);
}
