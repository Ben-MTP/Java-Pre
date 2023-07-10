package com.msoft.core.crud.impl;

import com.msoft.core.crud.DirectoriesService;
import com.msoft.core.entity.DirectionEntity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Triển khai các nghiệp vụ liên quan của Directory
 */
public class DirectoriesServiceImpl implements DirectoriesService {

    public DirectoriesServiceImpl() {
    }

    /**
     * Lấy danh sách file số liệu theo đường dẫn thư mục được chỉ định
     *
     * @param pathDirectory
     * @return
     */
    @Override
    public List<String> getFileOfDirectory(String pathDirectory) {
        File file = new File(pathDirectory);
        List<String> listName = new ArrayList<>();
        String fileNames[] = file.list();

        for (String fileName : fileNames) {
            listName.add(fileName);
        }
        return listName;
    }

    @Override
    public DirectionEntity getInfoDirectionUsingPathDirectory(String pathDirector) {
        return null;
    }

    /**
     * Tạo thư mục mới sử dụng PathDirectory
     *
     * @param pathDirector - đường dẫn path đến thư mục cần quản lý
     * @return
     */
    @Override
    public DirectionEntity createDirectoryUsingPathDirectory(String pathDirector) {
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

    /**
     * Hàm sửa tên của thư mục
     *
     * @param currentPathDirectory
     * @param newPathDirectory
     * @return
     */
    @Override
    public Boolean renameDirectory(String currentPathDirectory, String newPathDirectory) {
        Path currentPath = Paths.get(currentPathDirectory);
        Path newPath = Paths.get(newPathDirectory);

        try {
            Files.move(currentPath, newPath);
            System.out.println("RENAME SUCCESS...");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("CANNOT RENAME FILE...");
            return false;
        }
    }

    @Override
    public Boolean deleteDirectory(String pathDirector) {
        Path path = Paths.get(pathDirector);

        try {
            if (!Files.isDirectory(path)) {
                System.out.println("NOT A DIRECTORY");
                return false;
            }
            if (Files.list(path).findFirst().isPresent()) {
                System.out.println("DIRECTORY CONTAINS FILES");
                return false;
            }
            Files.delete(path);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean copyDirectory(String sourceDirectory, String targetDirectory) {
        Path sourcePath = Paths.get(sourceDirectory);
        Path targetPath = Paths.get(targetDirectory);

        try {
            if (!Files.exists(targetPath)) {
                Files.createDirectories(targetPath);
            }
            Files.walk(sourcePath).forEach(source -> {
                Path target = targetPath.resolve(sourcePath.relativize(source));
                try {
                    Files.copy(source, target);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
