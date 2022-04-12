## Hướng dẫn thực hành với Lambda


### Java Lambda Expressions
    parameter -> expression
    (parameter1, parameter2) -> expression
    (parameter1, parameter2) -> { code block }

### Using Lambda Expressions
    1. Function Interface
        + Single Abstract Method - SAM -> Chứa một và chỉ một method abstract
            @FunctionalInterface
        + Một trong các ứng dụng quan trong của Lambda Expression để tạo ra
        thể hiện (instance) cho chính interface đó.
        
    2. Toán tử mũi tên
        (->) chia biểu thức Lambda thành 2 phần: tham số và nội dung thực thi.
        (int a, int b) -> { do something };
    3. What? Why?
        + anonymous function
        + filter, try xuất dữ liệu
        + hỗ trợ thực hiện: tuần tự: Sequential và song song Parallel.
            Stream API.

    4. Syntax of Lambda
        (argument-list) -> {body}
        Biểu thức lambda trong java có 3 thành phần chính:
        + argument-list: Danh sách tham số, có thể có hoặc không, có một hoặc nhiều tham số.
            Danh sách tham số: danh sách tham số có trong FunctionalInterface
            Interface chỉ chứa một và chỉ một method abstract
        + arrow-operator: toán tử mũi tên được sử dụng để liên kết danh sách tham số và body của biểu thức.
        + Body: nội dung thực thi, là một khối lệnh hoặc một biểu thức.

        
    5. Ứng dụng của Lambda
    6. Note of Lambda


### Reference Document
    1. Java Lambda
       https://www.w3schools.com/java/java_lambda.asp
    2. Nắm rõ JAVA LAMBDA Expression cho người mới bắt đầu
        https://viblo.asia/p/nam-ro-java-lambda-expression-cho-nguoi-moi-bat-dau-RQqKLNwbl7z
       