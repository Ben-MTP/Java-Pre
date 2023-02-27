package com.tcp.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ManhKM on 9/15/2022
 * @project Sockets
 * ------
 * Client kết nối đến Server thông qua host và port mà được Server khởi tạo.
 */
public class TCPClient {

  public static void main(String[] args) {
    try {

      Socket socket = new Socket("127.0.0.1", 3004);

      /**
       * Tạo ra các luồng đọc và ghi dữ liệu
       * socket.getInputStream --> đọc dữ liệu đầu vào
       * socket.getOutputStream --> đẩy dữ liệu đầu ra
       */
      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a line: ");
      String st = scanner.nextLine();

      System.out.println("Sent: " + st);
      printWriter.println(st);
      printWriter.flush();

      String line = reader.readLine();
      System.out.println("Received: " + line);

      reader.close();
      printWriter.close();
      socket.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
