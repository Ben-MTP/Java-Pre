
# Đồng bộ và bất đồng bộ trong Java

## Nội dung chính

## Sử dụng với HashMap
* Có 2 cách để chúng ta có thể đồng bộ hóa một HashMap
    * Sử dụng Java Collection .synchronizedMap()
    * Sử dụng ConcurrentHashMap
    
## Sử dụng ThreadPool trong Java
* Mục đích:
    * Thread sinh ra để thực hiện một nhiệm vụ cụ thể, nhiều Thread cùng xử lý công việc giúp chúng ta giải quyết được bài toán
  thời gian và hiệu năng khi xử lý một tác vụ nào đó.
      * ?? Bài toàn đặt ra ở đây là có phải cứ sinh ra nhiều Thread thì tác vụ của chúng ta sẽ nhanh hơn mượt mà hơn ???
        * TL: Là không...
  
  
## ThreadPoolExecutor:


## Cách hoạt động của ThreadPoolExecutor


## ExecutorService:


## Cách tạo ExecutorService


## Cách sử dụng ExecutorService


## Cách kết thúc ExecutorService



## Reference document
* [Đồng bộ và bất đồng bộ](https://codelearn.io/sharing/dong-bo-va-bat-dong-bo-trong-java)
* [HashMap có thể đồng bộ hóa trong Java](https://viblo.asia/p/hashmap-concurrenthashmap-synchronizedmap-lam-the-nao-mot-hashmap-co-the-duoc-dong-bo-hoa-trong-java-924lJD8zKPM)
* [Tìm hiểu về Thread-Pool trong Java](https://viblo.asia/p/tim-hieu-ve-thread-pool-trong-java-OeVKBDQMlkW)
* [Java ExecutorService](https://jenkov.com/tutorials/java-util-concurrent/executorservice.html)
* [Writing your own ThreadPool from scratch in Java](https://blog.caffinc.com/2016/03/simple-threadpool/)
* [Java Bài 41: Thread Tập 1 – Thread Và Các Khái Niệm](https://yellowcodebooks.com/2018/08/10/java-bai-41-thread-tap-1-thread-va-cac-khai-niem/#.YnoPFOjP3Dc)

