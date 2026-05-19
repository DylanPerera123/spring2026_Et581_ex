package com.store.service;

import com.store.model.CartItem;
import com.store.model.Customer;
import com.store.model.Order;
import com.store.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private ProductService productService;

    private Map<Integer, List<CartItem>> carts = new HashMap<>();

    private List<Order> orders = new ArrayList<>();

    private int orderCounter = 1;

    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    public void addToCart(Customer customer, int productId, int quantity) {

        Product product = productService.getProductById(productId);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        List<CartItem> cart =
                carts.getOrDefault(customer.getId(), new ArrayList<>());

        cart.add(new CartItem(product, quantity));

        carts.put(customer.getId(), cart);

        System.out.println("Added to cart.");
    }

    public void checkout(Customer customer) {

        List<CartItem> cart = carts.get(customer.getId());

        if (cart == null || cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        Order order = new Order(orderCounter++, customer, cart);

        orders.add(order);

        System.out.println(order);

        carts.remove(customer.getId());
    }

    public List<Order> listOrders() {
        return orders;
    }
}