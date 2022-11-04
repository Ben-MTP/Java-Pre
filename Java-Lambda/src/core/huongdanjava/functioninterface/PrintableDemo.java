package core.huongdanjava.functioninterface;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 */
public class PrintableDemo {

    public static void main(String[] args) {

        /**
         * Khi khởi tạo đối tượng từ một Functinal Interface thì phải:
         * 1. Override lại các method ẩn danh của nó
         * 2. Object call lại chính method vừa Override đó.
         *
         * Kiểu giống như việc định nghĩa chỉ sử dụng tại thời điểm nó được khởi tạo
         * Chứ không được tái sử dụng ở các lần sau này.
         *
         * Nếu muốn tái sử dụng lại nó thì cần phải có một Object implement lại interface đó
         * Rồi từ đó tạo instance của chính implement đó.
         *
         */
        Printable obj = new Printable() {
            @Override
            public void print(int a) {
                System.out.println(String.format("Value of a: %s", a));
            }
        };

        obj.print(100);

        /**
         * Sử dụng Lambda Expression để định nghĩa method ẩn danh một cách sáng sủa hơn
         */

        Printable obj2 = (a) -> System.out.println(String.format("Value of a: %s", a));
        obj2.print(200);

        compare(a -> System.out.println("value: " + a));
    }

    public static void compare(Printable printable){
        printable.print(30);
    }
}
