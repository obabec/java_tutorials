package com.redhat;

import com.beust.jcommander.Parameter;

public class Settings {
    public boolean isTypeOfContent() {
        return typeOfContent;
    }

    @Parameter(names = {"--content","-c"},description = "Json sorting")
    private boolean typeOfContent = false;

    public String getPath() {
        return path;
    }

    @Parameter(names = {"--file","-f"},required = true)
    private String path;



}
