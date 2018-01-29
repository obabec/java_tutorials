package com.redhat.sorting.selectors.parse;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.DataParser;

public interface ParseSelector {
    DataParser selectParser(CommadLineParser cmdParser);
}
