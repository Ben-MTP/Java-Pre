## Giới thiệu về Lambda Expression:

1. Tại sao lại cần sử dụng Lambda Expression:

2. Cách sử dụng Lambda Expression:

2.1. @FunctionalInterface
    Là một Interface trong đó chỉ chứa duy nhất một abstract method

## Kiểu dữ liệu của Lambda Expression trong Java:

Không một class và vì thế cũng khong một Object nào liên quan trực tiếp tới Lambda Expresion.

Nó chỉ là một chỉ dẫn để Java tạo ra một Object cho các Function Interface.


## Function Interface trong Java:

Function Interface phải là một Interface

Function Interface chỉ có một và duy nhất một phương thức Abstract. Lambda Expression sẽ là người implement phương thức Abstract này.

Chúng ta có thể sử dụng Annotation @FunctionalInterface để đánh dấu class mà chúng ta muốn nó là Functional Interface

Nếu đã được đánh dấu @FunctionalInterface thì nếu cố tính thêm mới một Abstract khác thì sẽ gặp lỗi compile.


?? Tại sao trong Function Interface lại chỉ có một abstract method suy nhất.
Nếu có nhiều Abstract method trong Functional Interface thì khi Lambda triển khai thì làm sao biết được đâu là method cần triển khai.

## Tìm hiểu về Functional Consumer trong Java:


## Tìm hiểu về Functional Interface Supplier trong Java:


## Tìm hiểu về Functional Interface Predicate trong Java:


## Tìm hiểu về Functional Interface Function trong Java:


## Method reference trong Java:
    Object::methodName


