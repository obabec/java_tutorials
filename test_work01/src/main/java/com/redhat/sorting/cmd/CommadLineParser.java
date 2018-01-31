package com.redhat.sorting.cmd;

import com.beust.jcommander.Parameter;

public class CommadLineParser {

    @Parameter(names = {"--order", "-o"}, description = "Json sorting")
    private boolean sortOrder = false;

    @Parameter(names = {"--content", "-c"}, description = "Json sorting")
    private String typeOfContent = "plain";

    @Parameter(names = {"--file", "-f"}, required = true)
    private String path;

    @Parameter(names = {"--algorithm", "-a"}, required = true, description = "Select sorting algo")
    private String algorithm;

    @Parameter(names = {"--datatype", "-d"}, required = true, description = "Select proper datatype")
    private String datatype;

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getTypeOfContent() {
        return typeOfContent;
    }

    public void setTypeOfContent(String typeOfContent) {
        this.typeOfContent = typeOfContent;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }
}