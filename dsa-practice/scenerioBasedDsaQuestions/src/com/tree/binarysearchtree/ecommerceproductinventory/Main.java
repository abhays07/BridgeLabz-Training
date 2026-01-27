package com.tree.binarysearchtree.ecommerceproductinventory;

public class Main {
	 public static void main(String[] args) {

	        ProductBST inventory = new ProductBST();

	        //  Insert products
	        inventory.insert(new Product(3005, "Laptop", 65000));
	        inventory.insert(new Product(3001, "Mouse", 799));
	        inventory.insert(new Product(3008, "Keyboard", 1499));
	        inventory.insert(new Product(3003, "Monitor", 12000));

	        //  Scenario 1: Lookup
	        System.out.println("Searching product with SKU 3003:");
	        Product p = inventory.search(3003);
	        if (p != null) {
	            System.out.println("Found: " + p.name + ", Price: ₹" + p.price);
	        } else {
	            System.out.println("Product not found");
	        }

	        //  Scenario 2: Price Update
	        System.out.println("\nUpdating price of SKU 3005");
	        inventory.updatePrice(3005, 62000);

	        //  Scenario 3: Sorted List
	        System.out.println("\nProduct Inventory (Sorted by SKU):");
	        inventory.displayInOrder();
	    }
}