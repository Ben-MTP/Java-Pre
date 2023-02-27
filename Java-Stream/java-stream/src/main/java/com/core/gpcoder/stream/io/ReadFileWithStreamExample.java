package com.core.gpcoder.stream.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream ----- Đang chưa đọc được đường dẫn của file chính xác
 * java.nio.file.NoSuchFileException: lines.txt
 */
public class ReadFileWithStreamExample {

  public static void main(String[] args) {
    String fileName = "lines.txt";

    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

      stream.onClose(() -> System.out.println("!Done"))
          .filter(s -> s.startsWith("line3"))
          .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
