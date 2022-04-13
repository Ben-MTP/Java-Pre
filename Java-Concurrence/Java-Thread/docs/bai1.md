## Bài 1
## https://gokisoft.com/1103
Cho một danh sách là họ tên các sinh viên
Ví dụ: {“Nguyen Ngoc Lan”,”Duong Tien Nam”,”Ngo Anh Quan”,”Pham Van Duc”,”Tran Thi Ha”}

Một danh sách khác là quê tương ứng của các sinh viên trên:
Ví dụ: {“Hải Phòng”,”Hà Nội”,”Thái Nguyên”,”Hà Tĩnh”,”Quảng Ninh”}

Viết một ứng dụng Java sử dụng Thread để thực hiện công việc
- Thread thứ nhát sau mỗi giây sẽ hiển thị 1 tên người tương ứng trong danh sách tên
- Thread thứ 2 ngay sau đó sẽ hiển thị quê tương ứng của người đó
- Hai thread thực hiện mỗi thread 5 lần sẽ dừng lại
Phải đảm bảo rằng Thread1 luôn chạy trước rồi mới đến Thread2