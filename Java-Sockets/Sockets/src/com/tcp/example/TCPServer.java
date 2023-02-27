package com.tcp.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ManhKM on 9/15/2022
 * @project Sockets
 * -----
 * Bài toán một Client có thể kết nối đến nhiều Server
 * Server tiếp nhận request từ Client gửi lên và trả lại dữ liệu sau khi tính toán thứ gì đó.
 * Bài này sẽ biến đổi chuỗi kí tự thường thành chuỗi ký tự hoa
 */
public class TCPServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3004);
            System.out.println("Listening ...");
            while (true){
                /**
                 * Lắng nghe các yêu cầu kết nối từ phía client.
                 * Nếu có yêu cầu đến thì tạo ra một đối tượng Socket
                 */
                Socket socket = serverSocket.accept();

                /**
                 * Tạo ra các luồng đọc và ghi dữ liệu
                 * socket.getInputStream --> đọc dữ liệu đầu vào
                 * socket.getOutputStream --> đẩy dữ liệu đầu ra
                 */
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

                String line = reader.readLine();
                System.out.println("Received: " + line);
                System.out.println("Sent: " + line.toUpperCase());

                printWriter.println("SERVER-SOCKET-RESPONSE: "+line.toUpperCase());
                printWriter.flush();    // Đẩy ra ngoài bộ đệm

                reader.close();
                printWriter.close();
                socket.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
