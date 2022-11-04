package core.huongdanjava.functioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 */
public class SupplierFI {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("ManhKM", "TrangTT");
        s.stream().forEach(
                x -> print(() -> x)
        );
    }

    private static void print(Supplier supplier) {
        System.out.println(supplier.get());
    }
}
