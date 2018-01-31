package com.redhat.sorting.selectors.serialize;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.serialization.JsonSerializator;
import com.redhat.sorting.serialization.PlainDataSerializator;
import com.redhat.sorting.serialization.Serializator;

public class SerializatorSelectorImpl implements SerializatorSelector {

    @Override
    public Serializator selectSelizator(CommadLineParser commadLineParser) {

        if (commadLineParser.getTypeOfContent().contains("json")) {
            return new JsonSerializator();
        } else if (commadLineParser.getTypeOfContent().contains("plain")) {
            return new PlainDataSerializator();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
