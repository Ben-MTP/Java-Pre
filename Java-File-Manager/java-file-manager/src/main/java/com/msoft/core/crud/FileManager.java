package com.msoft.core.crud;

import com.msoft.core.entity.FileEntity;
import com.msoft.core.entity.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {

        String pathFile = "data/input/03/03-01/backup-data-03.txt";

        // B1: Create file and content:
        // int numberOfLine = 2_000;
        // System.out.println(createAndWriteContent2File(pathFile, numberOfLine).toString());

        // B2: Reading conent of file:
        // System.out.println(readContentOfFile(pathFile));
        onlyCreateFileWithPathFile(pathFile);


    }

    /**
     * Lấy thông tin liên quan của file
     *
     * @param pathFile
     * @return
     */
    private static FileEntity getInfoFileUsingPathFile(String pathFile) {
        File file = new File(pathFile);
        FileEntity fileEntity = new FileEntity(file.getName(), file.getParent(), file.getPath(),
                file.getAbsolutePath(), file.getAbsoluteFile().toString(), file.exists());
        if (fileEntity.isExists()) {
            return fileEntity;
        } else {
            System.out.println("File not exists....");
            return null;
        }
    }

    /**
     * Khi đã chuyển đổi thông tin file từ pathFile thành Object File
     * @param file - Object file sau khi đã lấy theo đường dẫn pathFile
     * @return
     */
    private static FileEntity getInfoFileUsingFile(File file){
        FileEntity fileEntity = new FileEntity(file.getName(), file.getParent(), file.getPath(),
                file.getAbsolutePath(), file.getAbsoluteFile().toString(), file.exists());
        if (fileEntity.isExists()) {
            return fileEntity;
        } else {
            System.out.println("File not exists....");
            return null;
        }
    }

    /**
     * Tạo file và ghi nội dung vào file
     *
     * @param pathFile
     * @return
     */
    private static FileEntity createAndWriteContent2File(String pathFile, int numberOfLine) {
        try {
            Formatter formatter = new Formatter(pathFile);
            for (int i = 0; i < numberOfLine; i++) {
                formatter.format("%s,%s,%s", i, "KHONG MINH MANH_" + i, "NEO_" + i + "\r\n");
            }
            formatter.close();

            return getInfoFileUsingPathFile(pathFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Can't formatter data of file...");
            return null;
        }
    }

    /**
     * Đọc nội dung của File
     * @param pathFile - đường dẫn path của File
     * @return
     */
    private static List<Person> readContentOfFile(String pathFile) {
        System.out.println("     ... START READING CONTENT OF FILE");
        File file = new File(pathFile);
        try {
            Scanner scanner = new Scanner(file);
            List<Person> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                Person person = convertString2Object(",", scanner.nextLine(), 3);
                list.add(person);
            }
            scanner.close();
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Chuyển đổi từ một String sang dạng Object
     * @param keyDetect - keyword dùng cho việc phân tách phần tử
     * @param line - đầu vào dòng dữ liệu
     * @param size - kích thước số thuộc tính, phần tử trên 1 dòng
     * @return
     */
    private static Person convertString2Object(String keyDetect, String line, int size) {
//        System.out.println("     ... CONVERT STRING TO OBJECT");
        Person person = new Person();
        if (!(line.length() == 0)) {
            String[] parts = line.split(keyDetect);
            if (parts.length == size) {
                person.setId(Long.parseLong(parts[0]));
                person.setName(parts[1]);
                person.setCompany(parts[2]);
            }
            return person;
        } else {
            return null;
        }
    }

    /**
     * Chỉ tạo file thôi mà chưa làm gì đối với nó hết
     * @param pathFile
     * @return
     */
    private static FileEntity onlyCreateFileWithPathFile(String pathFile){
        File file = new File(pathFile);
        try {
            if(file.createNewFile()){
                System.out.println("... CREATED FILE");
                return getInfoFileUsingFile(file);
            } else {
                System.out.println("... CAN'T CREATE FILE");
                if(file.exists()){
                    System.out.println("   ... FILE EXISTS ALREADY");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
