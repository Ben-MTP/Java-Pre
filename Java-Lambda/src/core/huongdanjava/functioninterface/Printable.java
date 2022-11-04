package core.huongdanjava.functioninterface;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 * -----
 * Khi sử dụng @FunctionalInterface đảm bảo được rằng nó chỉ một Abstract Method
 */
@FunctionalInterface
public interface Printable {

    /**
     * Mục đích in ra màn hình giá trị của a
     * @param a
     */
    void print(int a);

    /**
     * Default - có thể override hoặc không?
     * @param name
     */
    default void display(String name){
        System.out.println("Name: " + name);
    }

//    void print2(int a);
}
