## Nội dung bài học


## Cơ bản về JDBC


## Các thành phần chính
    1. Interface chính: 
        Driver:

        Connection:

        Statement:

        ResultSet:


    2. JDBC Driver -> Mỗi Database sẽ có một JDBC Driver khác nhau.

## Các dependency cần thêm:
    1. mysql-connector-java
        version: 

## Database MySQL
    1. Create Database
    2. Create Table class
    3. Create Table student
    4. Create Function in MySQL
        Nếu có lỗi về: "Error Code: 1418. This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled"
        Cách sử lý: 
            Execute the following in the MySQL console:

            SET GLOBAL log_bin_trust_function_creators = 1;
            
            Add the following to the mysql.ini configuration file:
            
            log_bin_trust_function_creators = 1;

## Thiết lập kết nối giữa ứng dụng Java với Database
    1. Interface DriverManager
        com.mysql.cj.jdbc -> Driver
    
    2. Method executeUpdate() -> Thực hiện insert, update, xóa.
    
    3. Method executeQuery() -> chỉ cho select.

    4. Method execute().



## CRUD với Java JDBC
    1. Create
        prepareStatement -> thêm mới một dữ liệu mới.

    2. Read

    3. Update

    4. Delete
    

## Reference Document
    1. Java JDBC CRUD Totutorial:
        SQL Insert, Select, Update and Delete Example
        https://www.codejava.net/java-se/jdbc/jdbc-tutorial-sql-insert-select-update-and-delete-examples


    2. 
    

    

    