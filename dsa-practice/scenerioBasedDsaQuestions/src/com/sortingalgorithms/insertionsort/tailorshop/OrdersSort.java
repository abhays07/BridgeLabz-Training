package com.sortingalgorithms.insertionsort.tailorshop;

import java.util.ArrayList;

public class OrdersSort {
	
	ArrayList< Order> orders = new ArrayList<Order>();
	
	  /**
     * Inserts a new order into the correct position
     * based on deadline using Insertion Sort technique
     */
	public void addOrders(Order newOrder) {
		int i = orders.size()-1;
		
	    // Shift position until correct place is found
		while(i>=0 && orders.get(i).getDeadline()>newOrder.getDeadline()) {
			i--;
		}
		
		// Insert order at correct position
		orders.add(i+1, newOrder);
		
		System.out.println("Order Added Successfully : "+ newOrder);
	}
	
	/**
     * Displays all orders in sorted order
     */
    void displayDetails() {
        System.out.println("\nOrder List (Sorted by Deadline):");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
	
}
