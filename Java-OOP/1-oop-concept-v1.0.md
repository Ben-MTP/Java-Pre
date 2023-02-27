## Hình như sai, nếu nói về OOP thì các tính chất chính của nó là gì? hãy giải thích chi tiết vào

Trả lời:

Đúng rồi, tôi đã nhầm lẫn. Nếu nói về tính chất của OOP, thì chúng ta có thể liệt kê như sau:

Tính đóng gói (Encapsulation): Đây là tính chất cho phép giấu thông tin bên trong của đối tượng, chỉ hiển thị ra bên ngoài những phương thức hoặc thuộc tính được cho phép sử dụng. Điều này giúp giảm thiểu rủi ro về việc dữ liệu bị sửa đổi hoặc thay đổi bất hợp lệ từ phía bên ngoài.

Tính kế thừa (Inheritance): Tính chất này cho phép các đối tượng con (subclass) kế thừa các thuộc tính và phương thức của đối tượng cha (superclass). Điều này giúp giảm thiểu sự lặp lại mã nguồn và tăng tính tái sử dụng của mã.

Tính đa hình (Polymorphism): Tính chất này cho phép các đối tượng có thể có các hành vi khác nhau trong cùng một phương thức, tùy thuộc vào đối tượng được gọi. Tính đa hình thường được triển khai thông qua các phương thức ảo (virtual methods) hoặc phương thức ghi đè (method overriding).

Tính trừu tượng (Abstraction): Tính chất này cho phép che giấu chi tiết triển khai bên trong của đối tượng, chỉ hiển thị ra các tính năng cần thiết để tương tác với đối tượng. Tính trừu tượng giúp tăng tính cô lập của các thành phần trong hệ thống, giảm sự phụ thuộc giữa chúng.

Trong Angular, các thành phần như Component, Service, Directive,... được thiết kế dựa trên các khái niệm của OOP, với mục đích tạo ra các đối tượng có tính chất đóng gói, kế thừa, đa hình và trừu tượng. Ví dụ, trong Component, ta có thể định nghĩa các thuộc tính và phương thức riêng biệt, chỉ hiển thị ra bên ngoài những phương thức hoặc thuộc tính được cho phép sử dụng, cũng như sử dụng kế thừa và đa hình để tạo ra các component con và tái sử dụng code.


## Lấy một ví dụ quản lý sinh viên, hãy thể hiện tính chất OOP trong bài toán này.

Trả lời:

Trong bài toán quản lý sinh viên, chúng ta có thể thể hiện các tính chất của OOP như sau:

Tính đóng gói (Encapsulation): Trong quản lý sinh viên, các thông tin về một sinh viên bao gồm tên, tuổi, mã số sinh viên, điểm số, v.v. có thể được đóng gói vào một đối tượng Student để bảo vệ dữ liệu và đảm bảo tính riêng tư.

Tính kế thừa (Inheritance): Trong quản lý sinh viên, chúng ta có thể xây dựng lớp con (subclass) từ lớp cha (superclass) Student, ví dụ như lớp UndergraduateStudent hoặc GraduateStudent. Lớp con sẽ kế thừa các thuộc tính và phương thức của lớp cha, đồng thời có thể mở rộng hoặc ghi đè (override) chúng để thích nghi với các nhu cầu riêng của lớp con.

Tính đa hình (Polymorphism): Trong quản lý sinh viên, chúng ta có thể sử dụng tính đa hình để xử lý các đối tượng Student một cách linh hoạt. Ví dụ như ta có thể tạo một danh sách (array) các đối tượng Student, bao gồm cả đối tượng UndergraduateStudent và GraduateStudent, và thực hiện các phương thức chung như tính trung bình điểm hoặc in thông tin sinh viên một cách chung chung, mà không cần biết chính xác loại đối tượng nào đang được xử lý.

Tính trừu tượng (Abstraction): Trong quản lý sinh viên, chúng ta có thể sử dụng tính trừu tượng để tách biệt giữa các đối tượng và phương thức của chúng. Ví dụ như ta có thể tạo một giao diện (interface) IStudent để mô tả các phương thức chung cho một sinh viên, sau đó xây dựng các lớp Student và các lớp con như UndergraduateStudent hoặc GraduateStudent để triển khai giao diện này. Tính trừu tượng giúp chúng ta tập trung vào các phương thức chung của các đối tượng, giúp giảm độ phức tạp của mã và dễ dàng bảo trì, nâng cấp ứng dụng.