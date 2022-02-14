## Cách triển khai java-logging

### Cách add file jar vào trong Project


### Cách đánh dấu file resource.


### Các lỗi vừa gặp
    1. Mở chuỗi kết nối Oracle Database với service-name:
    jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =  (ADDRESS = (PROTOCOL = TCP)(HOST = localhost)(PORT = 1521)))(CONNECT_DATA = (SERVICE_NAME = orcl12c) (SERVER = DEDICATED)))

    2. java.sql.SQLSyntaxErrorException: ORA-01950: no privileges on tablespace 'USERS'
    Quyền đến tablespace không có:
    Giải pháp:
    ALTER USER <user_name> QUOTA 100M ON <tablespace_name>
    GRANT UNLIMITED TABLESPACE TO <user_name>
    Ví dụ: 
    ALTER USER corebasic QUOTA 100M ON USERS
    GRANT UNLIMITED TABLESPACE TO corebasic
    

    3. ORA-00947: not enough values
    Khi thao tác với table -> không đủ các trường giá trị.