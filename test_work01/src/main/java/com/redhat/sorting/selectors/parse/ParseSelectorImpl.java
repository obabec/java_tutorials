package com.redhat.sorting.selectors.parse;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.DataParser;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.parse.PlainDataParser;

public class ParseSelectorImpl implements ParseSelector {
    @Override
    public DataParser selectParser(CommadLineParser cmdParser) {

        if (cmdParser.getTypeOfContent() == "json") {
            return new JsonDataParser();
        } else if (cmdParser.getTypeOfContent() == "plain") {
            return new PlainDataParser();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
