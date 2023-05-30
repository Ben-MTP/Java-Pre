package com.msoft.core.crud;

import com.msoft.core.crud.impl.FilesServiceImpl;

public class FileManager {
    public static void main(String[] args) {
        String pathFile = "data/input/03/03-01/backup-data-03.txt";
        FilesService filesService = new FilesServiceImpl();
        System.out.println(filesService.getInfoFileUsingPathFile(pathFile));
    }
}
