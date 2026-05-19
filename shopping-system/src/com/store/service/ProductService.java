package com.store.service;

import com.store.model.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void loadProducts(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                int quantity = Integer.parseInt(parts[3]);

                products.add(new Product(id, name, price, quantity));
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading products.");
        }
    }

    public List<Product> listAll() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateStock(int id, int quantity) {
        Product product = getProductById(id);

        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public List<Product> searchByName(String keyword) {
        List<Product> results = new ArrayList<>();

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(p);
            }
        }

        return results;
    }

    public List<Product> filterByPrice(double min, double max) {
        List<Product> results = new ArrayList<>();

        for (Product p : products) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                results.add(p);
            }
        }

        return results;
    }
}