package com.msoft.core.crud;

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
        String pathDirectory = "data/input/03/03-01";

        System.out.println(createDirectoryUsingPathDirectory(pathDirectory));
    }

    /**
     * Lấy danh sách file số liệu theo đường dẫn thư mục được chỉ định
     *
     * @param pathDirectory
     * @return
     */
    private static List<String> getFileOfDirectory(String pathDirectory) {
        File file = new File(pathDirectory);
        List<String> listName = new ArrayList<>();
        String fileNames[] = file.list();

        for (String fileName : fileNames) {
            listName.add(fileName);
        }
        return listName;
    }

    private static DirectionEntity getInfoDirectionUsingPathDirectory(String pathDirector) {

        return null;
    }

    /**
     * Tạo thư mục mới sử dụng PathDirectory
     *
     * @param pathDirector - đường dẫn path đến thư mục cần quản lý
     * @return
     */
    private static DirectionEntity createDirectoryUsingPathDirectory(String pathDirector) {
        Path directoryPath = Paths.get(pathDirector);
        boolean isExists = Files.exists(directoryPath);
        if (!isExists) {
            try {
                DirectionEntity directionEntity = new DirectionEntity();
                Path path = Files.createDirectories(directoryPath);
                directionEntity.setName(path.getFileName().toString());
                directionEntity.setPath(path.getParent().toAbsolutePath().toString());
                directionEntity.setCountFile(Long.valueOf(path.getNameCount()));
                directionEntity.setCountDirection(0L);
                System.out.println("... CREATED DIRECTION ");

                return directionEntity;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("... FAILED CREATE DIRECTION ");
            }
        } else {
            System.out.println("... FILE ALREADY EXISTS");
        }
        return null;
    }


}
