package com.redhat.sorting.selectors.output;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.output.DataWriter;

public interface WriterSelector {
    DataWriter selectWriter(CommadLineParser cmdParser);
}
