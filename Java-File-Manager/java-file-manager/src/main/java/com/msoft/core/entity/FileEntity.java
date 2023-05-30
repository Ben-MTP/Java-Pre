package com.msoft.core.entity;

public class FileEntity {
    private String name;
    private String parent;
    private String path;
    private String absolutePath;
    private String absoluteFile;
    private boolean exists;

    public FileEntity(String name, String parent, String path,
                      String absolutePath, String absoluteFile,
                      boolean exists) {
        this.name = name;
        this.parent = parent;
        this.path = path;
        this.absolutePath = absolutePath;
        this.absoluteFile = absoluteFile;
        this.exists = exists;
    }

    public FileEntity(){}

    public FileEntity(String name, String parent, String path, boolean exists) {
        this.name = name;
        this.parent = parent;
        this.path = path;
        this.exists = exists;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getAbsoluteFile() {
        return absoluteFile;
    }

    public void setAbsoluteFile(String absoluteFile) {
        this.absoluteFile = absoluteFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", path='" + path + '\'' +
                ", absolutePath='" + absolutePath + '\'' +
                ", absoluteFile='" + absoluteFile + '\'' +
                ", exists=" + exists +
                '}';
    }
}
