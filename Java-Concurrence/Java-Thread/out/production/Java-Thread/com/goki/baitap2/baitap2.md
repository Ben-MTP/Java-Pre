## Bài tập
    Tạo lớp Thread1 kế thừa Thread gồm các thuộc tính ArrayList<Integer> list 1
    - Thread này thực hiện sau 1s sinh ngẫu nhiên các số tự nhiên chạy từ 0-100 -> lưu kết quả vào mảng list 1
    Tạo lớp Thread2 kế thừa Thread gồm các thuộc tính ArrayList<Char> list2 .
    - Thread này thực hiện sau 2s thì sinh ngẫu nhiên các ký tự từ a-z và lưu vào mảng list2
    Trong phương thức main của lớp Test tạo ra 2 thread t1 và t2 lần lượt từ Thread1 và Thread2
    Khi t1 đã sinh 10 lần -> thực hiện dừng t1
    Khi t2 đã sinh được 10 kí tự thì stop t2
    Sau khi 2 thread 1 và 2 kết thúc. Thực hiện in kết quả của các thread trên thread main.