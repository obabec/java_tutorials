package com.redhat.sorting;

import com.beust.jcommander.JCommander;
import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.output.SortedDataWriter;
import com.redhat.sorting.parse.DataParser;
import com.redhat.sorting.read.RawDataReader;
import com.redhat.sorting.selectors.parse.ParseSelectorImpl;
import com.redhat.sorting.selectors.serialize.SerializatorSelectorImpl;
import com.redhat.sorting.selectors.sort.SortSelectorImpl;
import com.redhat.sorting.serialization.Serializator;
import com.redhat.sorting.sort.DataSorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {



    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        CommadLineParser cmdSettings = new CommadLineParser();
        JCommander.newBuilder().addObject(cmdSettings).build().parse(args);

        RawDataReader dataReader = new RawDataReader();
        ParseSelectorImpl parseSelector = new ParseSelectorImpl();

        DataParser dataParser = parseSelector.selectParser(cmdSettings);
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        DataSorter dataSorter = sortSelector.selectSorter(cmdSettings);

        SerializatorSelectorImpl serializatorSelector = new SerializatorSelectorImpl();
        Serializator dataSerializator = serializatorSelector.selectSelizator(cmdSettings);

        SortedDataWriter dataWriter = new SortedDataWriter();

        dataWriter.writeData( dataSerializator.serialize(dataSorter.sort(
                dataParser.parseData(dataReader.readData(cmdSettings)))));




    }
}
