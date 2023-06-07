package com.msoft.core.crud;

import com.msoft.core.crud.impl.DirectoriesServiceImpl;
import com.msoft.core.entity.DirectionEntity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Quản lý thông tin các thư mục
 * ----
 * CRUD Directories: Tạo, đọc nội dung, chỉnh sửa nội dung trong thư mục, chỉnh sửa tên của thư mục, xóa tên của thư mục
 */
public class DirectoriesManager {

    public static void main(String[] args) {
        String pathDirectory = "data/input/03/03-05-manhkm";
        DirectoriesService directoriesService = new DirectoriesServiceImpl();

        System.out.println(directoriesService.createDirectoryUsingPathDirectory(pathDirectory));
    }
}
