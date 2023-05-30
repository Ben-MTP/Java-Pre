package com.msoft.core.crud;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Quản lý thông tin các thư mục
 */
public class DirectoriesManager {

    public static void main(String[] args) {
        String pathDirectory = "data/input/03";

        System.out.println(getFileOfDirectory(pathDirectory));
    }

    /**
     * Lấy danh sách file số liệu theo đường dẫn thư mục được chỉ định
     * @param pathDirectory
     * @return
     */
    private static List<String> getFileOfDirectory(String pathDirectory) {
        File file = new File(pathDirectory);
        List<String> listName = new ArrayList<>();
        String fileNames[] = file.list();

        for (String fileName: fileNames){
            listName.add(fileName);
        }
        return listName;
    }
}
