package com.msoft.core.entity;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
public class Customer{
    private int id;
    private String name;
    private String address;
    private int productId;

    public Customer() {
    }

    public Customer(String name, String address, int productId){
        this.name = name;
        this.address = address;
        this.productId = productId;
    }

    public Customer(int id, String name, String address, int productId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", productId=" + productId +
                '}';
    }
}
