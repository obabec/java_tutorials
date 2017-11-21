package com.redhat;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.*;

public class Main {


    public static void main(String[] args)
    {
        Logger log = Logger.getLogger("myLogger");

        log.setLevel(Level.ALL);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        handler.setLevel(Level.INFO);
        log.addHandler(handler);
        //log.info("hello world");

        try
        {
            FileHandler fh = new FileHandler("logs.txt");
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            fh.setLevel(Level.WARNING);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        log.warning("What the hell is going on!!!");

        log.warning("Nothing");


    }
}
