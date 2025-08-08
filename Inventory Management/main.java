package com.sai.inventory;

public class main {
	 public static void main(String[] args) {
	        Inventory inventory = new Inventory();

	        // Adding products
	        inventory.addProduct(new Product("Laptop", 10));
	        inventory.addProduct(new Product("Mouse", 3));
	        inventory.addProduct(new Product("Keyboard", 2));

	        // Check low inventory
	        inventory.checkLowInventory();

	        // Remove a product
	        inventory.removeProduct("Mouse");

	        // Check low inventory again
	        inventory.checkLowInventory();
	    }
	}


