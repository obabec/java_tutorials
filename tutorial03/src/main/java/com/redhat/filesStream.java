package com.redhat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class filesStream
{

    public static String readFileText(String path)
    {
        try
        {
            String contect = new String(Files.readAllBytes(Paths.get(path)));
            return contect;
        }

        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> readFileByLines(String path)
    {
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(path));
            return lines;
        }

        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeContentToFile(String path, String content)
    {

        try
        {
            Files.write(Paths.get(path),content.getBytes(), StandardOpenOption.CREATE);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
