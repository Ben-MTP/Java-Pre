
## Ưu điểm khi implement Runnable

Khi implement Runnable thì có thể implement nhiều interface khác nữa.

Còn khi Extend từ Thread thì chỉ có thể 1 thằng cha thôi, ngoài ra thì không thể extend thì những thằng khác.

Khó mở rộng hơn Runnable.

Java Đa luồng nghe có vẻ cao sang nhưng hiểu bản chất của nó thì rất là đơn giản thôi.

## Sử dụng lớp Thread

Các phương thức hay sử dụng

Phương thức join(): Sử dụng để bắt thread đó phải dừng lại, cho thread khác thực thi.

## Thread Pool

Khi tạo Thread --> mỗi Task là một Thread.

Nếu hệ thống lớn, mỗi Task vào một Thread thì hơi phí.

ThreadPool là một cái cách để lưu tạm các Thread vào một cái Pool, bể chứa.

Thread nào nó rảnh thì nó nhào vô chạy.

ThreadPool tạo giải pháp khi số lượng Thread quá lớn.

Nếu tạo sẵn 3 Thread --> tạo nó cứ chạy xoay vòng 3 thread đó.

Ví dụ: Việc làm hồ sơ nhập học.

Có 3 cái bàn làm việc(bàn tiếp nhận hồ sơ) -> tương ứng giống số Thread cấp phát tối đa.

Khi có yêu cầu làm hồ sơ, task cứ xếp vào các thread đó, khi bàn nào trồng thì đẩy các task sang bàn đó.

Khi xử lý giống bộ phận 1 cửa nó sẽ nhanh hơn.

Nếu 3 bàn không đủ thì mở thêm một bàn nữa là bàn số 4.

Căn bản Thread nó cũng giống MultiThread thôi, nhưng ưu điểm của nó là tận dụng lại được toàn bộ sự nhàn rỗi của Thread.

Ví dụ nếu Thread 1 nó đã nhàn rỗi rồi mà cứ tạo mới thêm vào nó thì cũng lãng phí -> phải điều phối được chúng.

Java cung cấp:

Interface Executor: để thực thi các Task trong Thread Pool

Interface ExecutorService: để quản lý và điều khiển các Task.



