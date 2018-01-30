package com.redhat.cmd;

import com.beust.jcommander.Parameter;

public class CommandLineSettings {

    @Parameter(names = {"--order", "-o"},description = "Json sorting")
    private boolean sortOrder = false;

    @Parameter(names = {"--content", "-c"},description = "Json sorting")
    private boolean typeOfContent = false;

    @Parameter(names = {"--file", "-f"},required = true)
    private String path;


    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean isTypeOfContent() {
        return typeOfContent;
    }

    public void setTypeOfContent(boolean typeOfContent) {
        this.typeOfContent = typeOfContent;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
