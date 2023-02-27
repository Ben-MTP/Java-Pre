# Tìm hiểu về Thread Pool trong Java

Flow:

	TaskScheduleExecute
		|_ ScheduledThreadPoolExecutor
				|_ ThreadPoolExecutor
							|_ AbstractExecutorService
										|_ ExecutorService
													|_ Executor
				|_ ScheduledExecutorService
							|_ ExecutorService
										|_ Executor



## ThreadPool và Executor trong Java

## Cách tạo ThreadPool trong Java
    Java Concurrency API -> Thread Pool
    1. Cached thread pool
    2. Fixed thread pool (**)
    3. Single-threaded pool
    4. Fork/Join pool

## Executor
    1. newSingleThreadExecutor()
    2. newCachedThreadPool()
    3. newFixedThreadPool(int n) (**)
    4. newScheduledThreadPool(int corePoolSize)
    5. newSingleThreadScheduledExecutor()

## ThreadPoolExecutor và nguyên tắc quản lý pool size:
    ThreadPoolExecutor

## ThreadPoolExecutor vs ThreadPoolTaskExecutor -> Executor
    corePoolSize    : Số lương Thread mặc định trong Pool
    maxPoolSize     : Số lượng tối đa Thread trong Pool
    queueCapacity   : Số lượng tối đa của BlockingQueu

## Nguyên tắc vận hành:
    Ví dụ:
    corePoolSize: 5
    maxPoolSize: 15
    queueCapacity: 100
    K

## Reference Document

[Khái niệm ThreadPool và Executor trong Java | Loda](https://loda.me/articles/khai-niem-threadpool-va-executor-trong-java)


[Tìm hiểu về Thread Pool trong Java - viblo](https://viblo.asia/p/tim-hieu-ve-thread-pool-trong-java-OeVKBDQMlkW)


[Java ExecutorService | jenkov.com](https://jenkov.com/tutorials/java-util-concurrent/executorservice.html)