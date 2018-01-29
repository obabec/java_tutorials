package com.redhat.cmd;

import com.beust.jcommander.Parameter;

public class CommandLineSettings {
    public boolean isTypeOfContent() {
        return typeOfContent;
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    @Parameter(names = {"--order", "-o"},description = "Json sorting")
    private boolean sortOrder = false;

    @Parameter(names = {"--content", "-c"},description = "Json sorting")
    private boolean typeOfContent = false;

    public String getPath() {
        return path;
    }

    @Parameter(names = {"--file", "-f"},required = true)
    private String path;




}
