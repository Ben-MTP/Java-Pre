package com.msoft.core;

import com.msoft.core.crud.DirectoriesService;
import com.msoft.core.crud.impl.DirectoriesServiceImpl;

/**
 * Quản lý thông tin các thư mục
 * ----
 * CRUD Directories: Tạo, đọc nội dung,
 * chỉnh sửa nội dung trong thư mục,
 * chỉnh sửa tên của thư mục,
 * xóa tên của thư mục
 */
public class DirectoriesManager {

    public static void main(String[] args) {
        String pathDirectory = "data/input/03/03-06";
        DirectoriesService directoriesService = new DirectoriesServiceImpl();

        String sourceDirectory = "data/input/03/03-01-temp";
        String targetDirectory = "data/input/03/03-08898";
        System.out.println(directoriesService.copyDirectory(sourceDirectory, targetDirectory));
    }
}
