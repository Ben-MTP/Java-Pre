## Local Project:
    E:\1_CODING\LearnJava\Java-Pre\Java-Concurrence\Java-Thread

## Reference Document:
    [1] Multi-Thread:
        https://gpcoder.com/category/java-core/multi-thread/page/2/


## Nội dung bài học:
### Lập trình đa luồng trong Java (Java Multi-threading)
    1 Giới thiệu
        1.1 Thread là gì? Multi-thread là gì?
        1.2 Đa nhiệm (multitasking)
        1.3 Ưu điểm của đa luồng
        1.4 Nhược điểm của đa luồng
    2 Vòng đời (các trạng thái) của một Thread trong java
    3 Cách tạo luồng trong Java
        3.1 Tạo luồng bằng cách extend từ lớp Thread
        3.2 Tạo luồng bằng cách implement từ Interface Runnable
        3.3 Khi nào implements từ interface Runnable?
        3.4 Ví dụ minh họa sử dụng đa luồng
            3.4.1 Ví dụ Tạo luồng bằng cách extend từ class Thread
            3.4.2 Ví dụ Tạo luồng bằng cách implement từ Interface Runnable
    4 Các phương thức của lớp Thread thường hay sử dụng
        + suspend()
        + resume()
        + stop()
        + destroy()
        + isAlive()
        + yeild()
        + sleep(long)
        + join()
        + join(long)
        + getName();
        + setName(String threadName): Thay đổi tên của Thread
        + getId(): Trả về id của thread
        + getState(): Trả về trạng thái của thread
        + currentThread(): trả về tham chiếu của Thread đang được thi hành.
        + getPriority(): Trả về mức độ ưu tiên của Thread
        + setPriority(int): Thay đổi mức độ ưu tiên của Thread
        + isDaemon(): Kiểm tra nếu thread là một luồng Daemon
        + setDaemon(boolean): xác định thread là một luồng Deamon hay không?
        + interrupt():làm gián đoạn một luồng trong java.
        + isInterrupted(): kiểm tra nếu thread đã bị ngắt
        + isterrupted(): kiểm tra nếu thread hiện tại đã bị ngắt.
    
    5 Một số thông tin liên quan đến luồng
        5.1 Định danh của luồng (ThreadId)
        5.2 Tên của luồng (ThreadName)
        5.3 Độ ưu tiên của luồng (Priority)
            + Cách đặt độ ưu tiên: setPriority(int newPriority)
                MIN_PRIORITY
                NORM_PRIORITY
                MAX_PRIORITY
            + Cách lấy độ ưu tiên:
        5.4 Ví dụ minh họa
    6 Sử dụng phương thức sleep()
        Mục đích chính: Để tạm ngừng một thread cho một khoảng thời gian nhất định.

    7 Sử dụng join() và join(long)
        join() 
        
    8 Xử lý ngoại lệ cho Thread
### Luồng Daemon (Daemon Thread) trong Java
    1 Luồng Daemon (Daemon Thread) là gì?
        Normal Thread, Daemon Thread
            -> Khác nhau ở cách thức ngừng hoạt động.
    2 Luồng Daemon thường dùng làm gì?
    3 Ví dụ minh họa
        3.1 Tạo một luồng WorkingThread
        3.2 Chương trình Non-Daemon Thread
        3.3 Chương trình Daemon Thread

### Đồng bộ hóa các luồng trong Java
    1 Đối tượng khóa
    2 Đồng bộ là gì? Tại sao lại cần đồng bộ?
        2.1 Tại sao cần đồng bộ?
        2.2 Đồng bộ hóa là gì?
            synchronized -> việc sắp xếp thứ tự các luồng khi truy xuất vào
            cùng đối tượng sao cho không có xung đột dữ liệu.
    3 Java monitor là gì? Cách hoạt động của java monitor?
        3.1 Java monitor là gì ?
            JVM Monitor -> Java Virtual Machine.
            Công cụ giám sát hỗ trợ cho việc đồng bộ hóa các luồng.

        3.2 Cách hoạt động của java monitor
            + Dành được monitor - accquiring the monitor
            + Chiếm giữ monitor - owning the monitor
            + trả monitor - releasing the monitor
            + luồng thoát khỏi monitor - exiting the monitor
            Monitor Region
            + FIFO: First In First Out
            + LIFO: Last In First Out
            
    4 Các cách để đồng bộ trong Java
        4.1 Synchronized methods
            Đặt từ khóa: synchronized với method
            
        4.2 Synchronized statements/ Synchronized Block
            
        4.3 Static synchronized method
        
    5 So sánh các cách synchronized
    6 Phương thức wait(), notify(), notifyall()
        6.1 wait()
        6.2 notify() và notifyall()
        6.3 Ví dụ minh họa
    7 Deadlock (Khoá chết) là gì?
    8 Tại sao không nên dùng phương thức Thread.stop()
    9 Tại sao không nên dùng phương thức Thread.suspend(), Thread.resume()
    10 Tại sao không nên dùng phương thức Thread.Destroy()?
