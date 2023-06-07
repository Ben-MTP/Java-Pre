
## ConcurrentHashMap

### 1. Khi nào thì lên sử dụng ConcurrentHashMap

|STT|Vấn đề|
|---|---|
|1|Bạn nên sử dụng ConcurrentHashMap khi bạn cần tính đồng bộ trong dự án của bạn|
|2|Thread safe mà không cần đồng bộ hóa toàn bộ map.|
|3|Đọc có thể xảy ra rất nhanh trong khi ghi được thực hiện với một khóa.|
|4|Không có khóa ở cấp độ object.|
|5|ConcurrentHashMap không ném ra một ConcurrentModificationException nếu một luồng cố gắng sửa đổi nó trong khi một luồng khác đang lặp qua nó.|
|6|ConcurrentHashMap sử dụng vô số khóa.|


### 2. Vấn đề về SynchronizedHashMap

|STT|Vấn đề|
|---|---|
|1|Đồng bộ hóa ở mức độ Object.|
|2|Mọi hoạt động đọc / ghi cần phải có khóa.|
|3|Khóa toàn bộ thực thể collection là vấn đề đau đầu về hiệu suất.|
|4|Về cơ bản, điều này cho phép chỉ một luồng truy cập toàn bộ map và chặn tất cả các luồng khác.|
|5|Nó có thể gây ra việc tranh chấp tài nguyên.|
|6|SynchronizedHashMap trả về Iterator, nó có thể thất bại trong việc sửa đổi đồng thời.|



## Bài toán

Yêu cầu bài toán

|STT|Yêu cầu|
|---|---|
|1|Tạo class ConcurrentHashMapVsSynchronizedHashMap.java|
|2|Tạo object HashTable, SynchronizedMap và ConcurrentHashMap|
|3|Thêm mới và truy xuất 1 triệu entries với Map|
|4|Đo lường thời gian bắt đầu và kết thúc => milliseconds|
|5|Sử dụng ExecutorService để chạy 10 luồng(threads) song song|

Qua ví dụ Testing hiệu năng có thể thấy ConcurrentHashMap là có hiệu suất tốt nhất, thời gian sử lý nhất, hoàn thiện các yêu cầu.


## Reference document:

[HashMap, ConcurrentHashMap, SynchronizedMap, Làm thế nào để một Hashmap có thể đồng bộ hóa trong Java](https://viblo.asia/p/hashmap-concurrenthashmap-synchronizedmap-lam-the-nao-mot-hashmap-co-the-duoc-dong-bo-hoa-trong-java-924lJD8zKPM)