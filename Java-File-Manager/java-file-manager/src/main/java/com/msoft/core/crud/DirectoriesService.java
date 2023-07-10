package com.msoft.core.crud;

import com.msoft.core.entity.DirectionEntity;

import java.util.List;

/**
 * Định nghĩa các Service cần có của một thư mục trong hệ thống
 */
public interface DirectoriesService {
    List<String> getFileOfDirectory(String pathDirectory);

    DirectionEntity getInfoDirectionUsingPathDirectory(String pathDirector);

    DirectionEntity createDirectoryUsingPathDirectory(String pathDirector);

    Boolean renameDirectory(String currentPathDirectory, String newPathDirectory);

    Boolean deleteDirectory(String pathDirector);

    Boolean copyDirectory(String sourceDirectory, String targetDirectory);
}
