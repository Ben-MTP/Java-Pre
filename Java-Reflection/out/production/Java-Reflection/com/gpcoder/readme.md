## Các Annotation được sử dụng để làm gì?

Annotation được sử dụng cho các mục đích:

1. Chỉ dẫn cho trình biên dịch (Compiler)

2. Chỉ dẫn trong thời điểm biên dịch (Buil-time)

3. Chỉ dẫn trong thời gian chạy (Runtime)

## Các Annotation sẵn có của Java:


## Cách tạo Custom Annotations:

Sử dụng @interface

Không có thân hàm
Không có tham số hàm
Khai báo trả về phải là một kiểu cụ thể
    Các kiểu nguyên thủy: boolean, int, float
    Enum
    Annotation
    Class
Có thể có giá trị mặc định

@Retention và @Target là 2 annotation sẵn có của Java

@Retention: Dùng để chú thích mức độ tồn tại của một Annotation nào đó

SOURCE: Tồn tại trên code nguồn, và không được bộ dịch (compiler) nhận ra.
CLASS: Mức tồn tại được bộ dịch nhận ra, nhưng không được nhận biết bởi máy ảo tại thời điểm chạy (Runtime).
RUNTIME: Mức tồn tại lớn nhất, được bộ dịch (compiler) nhận biết, và máy ảo thời điểm chạy cũng nhận ra sự tồn tại của nó.

@Target: Dùng để chú thích cho một Annotation khác, và annotation đó sẽ được sử dụng trong phạm vi nào đó.

TYPE : Gắn trên khai báo Class, interface, enum, annotation.
FIELD : Gắn trên khai báo trường (field), bao gồm cả các hằng số enum.
METHOD : Gắn trên khai báo method.
PARAMETER : Gắn trên khai báo parameter
CONSTRUCTOR : Gắn trên khai báo cấu tử
LOCAL_VARIABLE : Gắn trên biến địa phương.
ANNOTATION_TYPE : Gắn trên khai báo Annotation
PACKAGE : Gắn trên khai báo package.


@Documented


