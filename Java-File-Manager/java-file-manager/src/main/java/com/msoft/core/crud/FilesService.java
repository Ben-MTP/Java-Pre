package com.msoft.core.crud;

import com.msoft.core.entity.FileEntity;
import com.msoft.core.entity.Person;

import java.io.File;
import java.util.List;

public interface FilesService {

    FileEntity getInfoFileUsingPathFile(String pathFile);

    FileEntity getInfoFileUsingFile(File file);

    FileEntity createAndWriteContent2File(String pathFile, int numberOfLine);

    List<Person> readContentOfFile(String pathFile);

    Person convertString2Object(String keyDetect, String line, int size);

    FileEntity onlyCreateFileWithPathFile(String pathFile);


}
