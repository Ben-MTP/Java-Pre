## Application Server


## Application Client


## Logic thực hiện
### Bước 1: Máy chủ tạo ServerSocket
Phía ứng dụng tạo một đối tượng thuộc lớp ServerSocket với một cổng được chỉ ra để ứng dụng khách có thể kết nối đến.


### Bước 2: Call method accept()
Ứng dụng máy chủ gọi phương thức accept() của lớp ServerSocket. Phương thức này sẽ đợi cho đến khi một ứng dụng khách kết nối ddeeens cổng đã đượcc chỉ định. 


### Bước 3: Máy khách tạo Object -> connect
Phía ứng dụng khách tạo một đối tượng thuộc lớp Socket với các thông số là IP và post của ứng dụng chủ. Nếu đối tượng được tạo thành công, ứng dụng khách có được đối tượng socket để trao đổi thông tin với máy chủ.


### Bước 4: Máy chủ đợi kết nối
Phía ứng dụng chủ, khi có ứng dụng khách kết nối đến, phương thức accept() trả về một đối tượng thuộc lớp Socket và ứng dụng chủ có thể sử dụng đối tượng này để trao đổi thông tin với khách.

### Bước 5: Demo


## Tham khao:
1. [Java - Sockets] 
https://viblo.asia/p/java-sockets-WAyK8x7kKxX

2. [CƠ CHẾ HOẠT ĐỘNG CỦA REMOTE PROCEDULE CALL (RPC)]
https://letonphat.wordpress.com/2011/03/05/c%C6%A1-ch%E1%BA%BF-ho%E1%BA%A1t-d%E1%BB%99ng-c%E1%BB%A7a-remote-procedule-call-rpc/

