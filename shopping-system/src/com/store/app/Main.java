package com.store.app;

import com.store.model.Customer;
import com.store.model.Product;
import com.store.service.CustomerService;
import com.store.service.OrderService;
import com.store.service.ProductService;

public class Main {
    public static void main(String[] args) {

        ProductService ps = new ProductService();
        CustomerService cs = new CustomerService();
        OrderService os = new OrderService(ps);

        ps.loadProducts("data/products.txt");
        cs.loadCustomers("data/customers.txt");

        System.out.println("=== PRODUCTS ===");
        ps.listAll().forEach(System.out::println);

        System.out.println("\n=== CUSTOMERS ===");
        cs.listAll().forEach(System.out::println);

        Product newProduct = new Product(200, "MacBook Pro", 2500.00, 3);
        ps.addProduct(newProduct);
        ps.updateStock(101, 50);
        ps.removeProduct(103);

        System.out.println("\n=== PRODUCTS AFTER CRUD ===");
        ps.listAll().forEach(System.out::println);

        Customer newCustomer = new Customer(10, "Dylan", "dylan@email.com");
        cs.addCustomer(newCustomer);

        newCustomer.setName("Dylan Updated");
        newCustomer.setEmail("dylanupdated@email.com");

        cs.deleteCustomer(2);

        System.out.println("\n=== CUSTOMERS AFTER CRUD ===");
        cs.listAll().forEach(System.out::println);

        Customer c1 = newCustomer;

        os.addToCart(c1, 101, 2);
        os.addToCart(c1, 104, 1);

        System.out.println("\n=== CHECKOUT ===");
        os.checkout(c1);

        System.out.println("\n=== ALL ORDERS ===");
        os.listOrders().forEach(System.out::println);

        System.out.println("\n=== SEARCH PRODUCT ===");
        ps.searchByName("Apple").forEach(System.out::println);

        System.out.println("\n=== FILTER PRICE ===");
        ps.filterByPrice(500, 3000).forEach(System.out::println); 
    }
}