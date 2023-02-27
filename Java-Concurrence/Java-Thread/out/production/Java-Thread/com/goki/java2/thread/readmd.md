
## Đa luồng
    - Khái niệm đa luồng là gì
    - Triển khai code đa luồng
    - Đồng bộ Thread
        - Tại sao chúng ta cần đồng bộ luồng
            -> An toàn dữ liệu
        - Synchronized
            -> Đồng bộ lên chính một phương thức nào đó
            
        - wait/notify

    - Deadlock

## Synchronized
    - wait, notify, notifyAll
    - Dùng kết hợp với 3 cái trên:
        wait -> đưa luồng về trạng thái dừng
        notify, notifyAll -> đánh thức chúng dậy và cho chúng chạy.

    Bài tập
    - T1 >> sinh ngẫu nhiên 1 số tự nhiên từ 1 - 100
    - T2 >> hiển thị bình phương số đã được sinh từ T1
    1. Tạo 2 thread thực hiện yêu cầu trên
    2. Đồng bộ luồng
        T1 Thực hiện > rad > T1 đợi T2 > hiển thị bình phương số rad > in ra màn hình 
        > T2 wait > T1 chạy > vòng tròn như trên
    3. Sinh ngẫu nhiên 10 số > stop 2 luồng

    Phân tích:
    T1 > sinh ra số và phải có nơi lưu trữ
    T2 > lấy rad => thực hiện logic hiển thị.

    Nên tạo ra một phần data để quản lý dữ liệu của DataMrg của T1 và T2
    

## Reference Document:
[Java Concurrency - Java 8](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)

[Java Advanced - Java 8](https://gokisoft.com/java-advanced.htm)