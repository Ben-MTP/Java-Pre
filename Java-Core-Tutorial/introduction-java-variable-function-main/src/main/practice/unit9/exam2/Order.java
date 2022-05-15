package main.practice.unit9.exam2;

/**
 * Bài tập 2:
 *      Hình ảnh được đính kèm trong file.
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class Order extends ParentOrder{
    private Long id;
    private Double quantity;
    private Double price;

    public Order(Long id, Double quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}' + '\n';
    }
}
