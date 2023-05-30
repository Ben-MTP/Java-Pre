package com.msoft.core.entity;

import java.util.List;

public class DirectionEntity {
    private String name;
    private String path;
    private List<FileEntity> files;
    private Long countFile;
    private Long countDirection;

    public DirectionEntity() {
    }

    public DirectionEntity(String name, String path, List<FileEntity> files, Long countFile, Long countDirection) {
        this.name = name;
        this.path = path;
        this.files = files;
        this.countFile = countFile;
        this.countDirection = countDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<FileEntity> getFiles() {
        return files;
    }

    public void setFiles(List<FileEntity> files) {
        this.files = files;
    }

    public Long getCountFile() {
        return countFile;
    }

    public void setCountFile(Long countFile) {
        this.countFile = countFile;
    }

    public Long getCountDirection() {
        return countDirection;
    }

    public void setCountDirection(Long countDirection) {
        this.countDirection = countDirection;
    }

    @Override
    public String toString() {
        return "DirectionEntity{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", files=" + files +
                ", countFile=" + countFile +
                ", countDirection=" + countDirection +
                '}';
    }
}
