package main.practice.unit9.exam2;

import java.util.*;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class OrderManager {
    public static void main(String[] args) {

        double totalValueOfOrder = 0;
        List<Order> listOrder = new ArrayList<>();

        listOrder.add(new Order(1L, randomValue(), randomValue()));
        listOrder.add(new Order(2L, randomValue(), randomValue()));
        listOrder.add(new Order(3L, randomValue(), randomValue()));
        listOrder.add(new Order(4L, randomValue(), randomValue()));
        listOrder.add(new Order(5L, randomValue(), randomValue()));
        listOrder.add(new Order(6L, randomValue(), randomValue()));
        listOrder.add(new Order(7L, randomValue(), randomValue()));
        listOrder.add(new Order(8L, randomValue(), randomValue()));
        listOrder.add(new Order(9L, randomValue(), randomValue()));

        System.out.println("Danh sách ban đầu: ");
        System.out.println(listOrder);

        /**
         * Tính tổng giá trị của đơn hàng:
         * 1. Duyệt ListOrder
         * 2. Lấy ra chỉ số của list_order -> rồi nhân các yếu tố.
         */
        System.out.println("1. Xuất danh sách giá trị của Order: (giá trị = price * quantity): ");
        for (Order order: listOrder) {
            double totalValue = order.getPrice() * order.getQuantity();
            totalValueOfOrder = totalValueOfOrder + totalValue;
            order.setTotalValue(totalValue);
            System.out.println("\t"+"["+order.getId() + "] have total: " + order.getTotalValue());
        }

        System.out.println("2. Tổng giá trị của Order: " + totalValueOfOrder);

        Optional<Order> max = listOrder.stream()
                .max(Comparator.comparingDouble(p -> p.getTotalValue()));
        System.out.println("3. Order có giá trị lớn nhất trong list: " + max.get().getId() + " - " + max.get().getTotalValue());

        Optional<Order> min = listOrder.stream()
                .min(Comparator.comparingDouble(p -> p.getTotalValue()));
        System.out.println("4. Order có giá trị nhỏ nhất trong list: " + min.get().getId() + " - " + min.get().getTotalValue());
    }

    private static double randomValue() {
        Random random = new Random();
        int enemies = random.nextInt(100);
        return enemies;
    }
}
