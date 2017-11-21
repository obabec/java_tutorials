package com.redhat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;;

public class Main
{

    public static void main(String[] args) throws IOException {

        filesStream.writeContentToFile("test.txt","123456789\n987654321");

        List<String> list = filesStream.readFileByLines("test.txt");

        String test = filesStream.readFileText("test.txt");

        list.forEach(System.out::println);
        System.out.println(test.replace("\n",""));

    }




}
