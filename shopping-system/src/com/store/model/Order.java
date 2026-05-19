package com.store.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    private List<CartItem> items;
    private LocalDateTime orderDate;
    private double total;

    public Order(int id, Customer customer, List<CartItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.orderDate = LocalDateTime.now();
        this.total = calculateTotal();
    }

    public double calculateTotal() {
        double sum = 0;

        for (CartItem item : items) {
            sum += item.getSubtotal();
        }

        return sum;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer.getName() +
                ", total=" + total +
                ", orderDate=" + orderDate +
                ", items=" + items +
                '}';
    }
}