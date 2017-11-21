package com.redhat;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args)
    {
    LOGGER.setLevel(Level.SEVERE);
    ConsoleHandler handler = new ConsoleHandler();
    handler.setFormatter(new SimpleFormatter());
    LOGGER.addHandler(handler);
    handler.setLevel(Level.ALL);
    LOGGER.fine("WARNING DO NOT ENTER!");

    }
}
