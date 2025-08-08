package com.sai.inventory;
import java.util.ArrayList;
public class Inventory {   
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product to inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    // Remove a product from inventory by name
    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
        System.out.println(productName + " removed from inventory.");
    }

    // Check for low inventory (quantity < 5)
    public void checkLowInventory() {
        boolean foundLow = false;
        System.out.println("\nChecking for low inventory...");
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                System.out.println("⚠ Low stock: " + product.getName() + " (Quantity: " + product.getQuantity() + ")");
                foundLow = true;
            }
        }
        if (!foundLow) {
            System.out.println("All products have sufficient stock.");
        }
    }
}

