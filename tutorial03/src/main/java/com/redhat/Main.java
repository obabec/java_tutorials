package com.redhat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;;

public class Main
{

    public static void main(String[] args) throws IOException {

        List<String> listerino;

        listerino = Files.readAllLines(Paths.get("/home/obabec/Documents/tutorials/java_tutorials/tutorial03/test.txt"));

        listerino.forEach(System.out::println);


    }




}
