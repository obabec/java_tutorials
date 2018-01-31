package com.redhat.sorting.selectors.serialize;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.serialization.JsonSerializator;
import com.redhat.sorting.serialization.PlainDataSerializator;
import com.redhat.sorting.serialization.Serializator;

public class SerializatorSelectorImpl implements SerializatorSelector {

    @Override
    public Serializator selectSelizator(CommadLineParser commadLineParser) {

        if (commadLineParser.getTypeOfContent() == "json") {
            return new JsonSerializator();
        } else if (commadLineParser.getTypeOfContent() == "plain") {
            return new PlainDataSerializator();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
