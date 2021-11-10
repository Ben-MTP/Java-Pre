## Application Server


## Application Client


## Logic thực hiện
### Bước 1: Máy chủ tạo ServerSocket
Phía ứng dụng tạo một đối tượng thuộc lớp ServerSocket với một cổng được chỉ ra để ứng dụng khách có thể kết nối đến.


### Bước 2: Call method accept()
Ứng dụng máy chủ gọi phương thức accept() của lớp ServerSocket. Phương thức này sẽ đợi cho đến khi một ứng dụng khách kết nối ddeeens cổng đã đượcc chỉ định. 


### Bước 3:
Phía ứng dụng khách tạo một đối tượng thuộc lớp Socket với các thông số là IP và post của ứng dụng chủ. Nếu đối tượng được tạo thành công, ứng dụng khách có được đối tượng socket để trao đổi thông tin với máy chủ.


### Bước 4:
Phía ứng dụng chủ, khi có ứng dụng khách kết nối đến, phương thức accept() trả về một đối tượng thuộc lớp Socket và ứng dụng chủ có thể sử dụng đối tượng này để trao đổi thông tin với khách.

### Bước 5:


### Bước 6:


### Bước 7:


## Tham khao:
1. [Java - Sockets] https://viblo.asia/p/java-sockets-WAyK8x7kKxX

2. 