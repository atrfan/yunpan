package com.qst.yunpan.pojo;

import java.util.List;

public class SummaryFile {
    private boolean isFile;
    private  String path;
    private  String fileName;

    public boolean getisFile() {
        return isFile;
    }

    public void setisFile(boolean file) {
        isFile = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getListdiretory() {
        return listdiretory;
    }

    public void setListdiretory(int listdiretory) {
        this.listdiretory = listdiretory;
    }

    public List<SummaryFile> getListFile() {
        return listFile;
    }

    public void setListFile(List<SummaryFile> listFile) {
        this.listFile = listFile;
    }

    private  int listdiretory;
    private List<SummaryFile> listFile;
}