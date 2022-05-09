## Java Serializable là gì? Serialization và Deserialization trong Java

### Java Serializable là gì?


### Tại sao cần Serialization?
    Dữ liệu chuyển đổi qua lại với nhau bằng byte chứ không phải là object.
    -> Cần một cơ chế để có thể hiểu qua lại giữa việc gửi và nhận này.
    + Quá trình serilization hoàn toàn độc lập với platform -> không phụ thuộc vào hệ điều hành.
        -> chuyển đổi giữa byte và Object các module.

### Coding
    Object -> ghi ra file
    file -> reading -> Object/Module

### Một số lưu ý về Serialization trong Java


### Reference Document
    https://stackjava.com/java/java-serializable-la-gi-serialization-va-deserialization-trong-java.html

    https://docs.oracle.com/javase/tutorial/jndi/objects/serial.html

    https://samderlust.com/dev-blog/java/write-read-arraylist-object-file-java

