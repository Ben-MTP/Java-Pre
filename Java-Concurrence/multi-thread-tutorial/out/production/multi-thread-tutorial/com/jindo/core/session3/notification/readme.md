## Sử dụng với bài toán Notification trong bài toán đa luồng.

### Bài toán

Nếu trong quá trình luồng 1 khóa đối tượng Resource b, sau khi thực hiện được 1 đoạn công việc, luồng 1 cần luồng 2 làm việc số việc gì đó trên resource B này.

Sau khi đó mới có điều kiện để luồng 1 thực hiện tiếp logic -> lúc này mới có đủ dữ liệu để làm tiếp.

wait(), notify(), notifyall()

