package com.store.service;

import com.store.model.Customer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public void loadCustomers(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String email = parts[2];

                customers.add(new Customer(id, name, email));
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading customers.");
        }
    }

    public List<Customer> listAll() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }
}