## Concept:
1. Lập trình đa luồng trong Java (Java Multi-threading)

	1.4. Nhược điểm của đa luồng
		tránh các luồng chết - dead lock.
		Deadlock xảy ra khi 2 tiến trình đợi nhau -> không tiến trình bào hoàn thành -> chết cả 2.
		
	3. Cách tạo luồng trong Java
	extend from class Thread
	implement from interface Runnable
		-> Phân biệt try-catch, try-catch-finnaly, try-finnaly.
		
		3.1. Tạo luồng bằng cách extend từ lớp Thread
		
		
		3.2. Tạo luồng bằng cách implement từ Interface Runnable:
		
		
		3.4. Ví dụ minh họa sử dụng đa luồng
			3.4.1. Ví dụ tạo luồng bằng cách Extend từ class Thread
			
			3.4.2. Ví dụ tạo luồng bằng cách Impelement từ Interface Runnable
			
			
	4. Các phương thức của lớp Thread thường hay sử dụng
	
	
	5. Một số thông tin liên quan đến luồng
		5.1. Định danh của luồng (ThreadId)
		
		
		5.2. Tên của luồng (ThreadName)
		
		
		5.3. Độ ưu tiên của luồng (Priority)
		
		
		5.4. Ví dụ
		
		
	6. Sử dụng phương thức sleep()
	
	
	
	7. Sử dụng join() và join (long)
	
	
	8. Xử lý ngoại lệ cho Thread
	
	
	
	
	

2. Luồng Daemon (Daemon Thread) trong Java


3. Đồng bộ hóa các luồng trong Java



4. Hướng dẫn tạo và sử dụng Thread Pool trong Java



5. Lập trình đa luồng với Callable và Future trong Java



6. Sử dụng Fork/Join Framework với ForkJoinPool trong Java



7. Sử dụng CountDownLatch trong Java



8. Sử dụng CyclicBarrier trong Java



9. Lập trình đa luồng với CompletableFuture trong Java 8



10. Thực thi nhiều tác vụ cùng một lúc như thế nào trong Java?



11. Semephore trong Java



12*. Vấn đề Nhà sản xuất (Producer) - Người tiêu dùng (Consumer) và đồng bộ hóa các luồng trong Java. 



## Reference Document
1. Multi-thread
	https://gpcoder.com/category/java-core/multi-thread/
	
	
2. Java Concurrency and Multithreading
	https://www.youtube.com/playlist?list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4
	
3. Java ExecutorService
	https://jenkov.com/tutorials/java-util-concurrent/executorservice.html#task-delegation
	