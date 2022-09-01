## Nội dung bài trước

## Kế thừa: 

Là lớp con được thừa hưởng lại những gì mà cha của nó cho phép (Cứ khác private là cho phép)

## Java không hỗ trợ đa kế thừa


## Lớp final class

Đã là final (đứng vị tri cuối chuỗi) thì nó không cho phép kế thừa nó lại lần nữa.

Tránh sửa logic, final đóng gói lại thành zin, ngon,xịn.

## Phương thức khởi tạo cha-con

Xử lý trong phương thức khởi tạo.

Phương thức khởi tạo của lớp cha không được override lại của lớp con.

Phương thức khởi tạo của lớp con luôn luôn gọi phương thức khởi tạo ở lớp cha.

Có thể gọi tường minh bằng từ khóa supper

Trong trường hợp user không gọi trực tiếp -> thì ngầm định nó cũng sẽ gọi phương thức khởi tạo mặc định của lớp cha.

Trật tự xử lý constructor luôn đi từ lớp cha -> xử lý xong thì mới đi xuống lớp con.

## Phương thức tĩnh - static

Phương thức tĩnh vẫn được kế thừa lại từ lớp con nhưng mà chúng không bị ghi đè thôi.

## Cơ chế overriding và overloading

Overwireding chỉ dùng trong quan hệ kế thừa thôi

Còn Overloading trong lớp đơn, kế thừa đều dùng được hết

Overwriteding trùng tên, trùng danh sách tham số

Overloading trùng tên, khác kiểu, danh sách tham số truyền vào

## Phương thức final

Phương thức là final thì không được phép ghi đè ở lớp con

