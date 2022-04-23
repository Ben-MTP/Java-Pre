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
    https://loda.me/articles/khai-niem-threadpool-va-executor-trong-java
