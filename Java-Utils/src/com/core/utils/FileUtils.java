package com.core.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author ManhKM on 6/20/2022
 * @project Java-Utils
 */
public class FileUtils {
    public static String readFile(String file) throws IOException {
        File f = new File(file);
        if (f.isFile()) {
            return readFile(f);
        }
        return null;
    }

    public static String readFile(File f) throws IOException {
        byte[] bytes = Files.readAllBytes(f.toPath());
        return new String(bytes);
    }

    public static void main(String[] args) throws IOException {
        //System.out.println(readFile("file/vasonline-share/VASONLINE/KPI_MO_VASONLINE_20220619.txt"));

        File fileData = new File("file/vasonline-share/VASONLINE/KPI_MO_VASONLINE_20220619.txt");
        System.out.println(readFile(fileData));
    }
}
