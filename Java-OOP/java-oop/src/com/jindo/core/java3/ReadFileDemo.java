package com.jindo.core.java3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ManhKM on 8/30/2022
 * @project java-oop
 */
public class ReadFileDemo {

    public static void main(String[] args) {
        //readFile();
        writeFile();


    }

    private static void writeFile() {
        File file = new File("src/data/data2.txt");
        FileWriter fileWriter = null;
        PrintWriter writer = null;
        try {
            fileWriter = new FileWriter(file, true);
            writer = new PrintWriter(fileWriter);
            writer.println("Khong Minh Manh");
            writer.println(200L);
            writer.println(9.143456);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

    }

    private static void readFile() {
        File file = new File("src/data/data.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String name = scanner.nextLine();
            String address = scanner.nextLine();

            System.out.printf("Name=%s, Point=%s", name, address);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
