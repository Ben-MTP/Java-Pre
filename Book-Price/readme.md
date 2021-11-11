## Đề bài:
Câu 6: 
Sử dụng công nghệ socket viết ứng dụng BookPrice.
Ứng dụng có chức năng nhận vào mã số (ISBN) của một cuốn sách và trả về giá + thông tin khác của cuốn sách đó.
Cụ thể, ứng dụng sẽ có 2 phần chính:
Phần 1: Ứng dụng khác tương tác với với người dùng để nhận mã sách.
Thông tin này sẽ được ứng dụng khách chuyển cho phía ứng dụng (qua socket).
Ứng dụng chủ lấy thông tin giá sách từ cơ sở dữ liệu dựa trên số sách và trả về cho khách hàng.


## Thông tin
Client -> nhập vào ISBN -> mã sách
Server -> trả về thông tin sách.

Thông tin gồm: 
	ID, ISBN, Name, Price, Category, Publish, Total pages, Author.
	Thông tin sách được lưu ở phần data.xml
	
## Mở thêm nhiều Client
Mở thêm một số client nữa để giao tiếp.
