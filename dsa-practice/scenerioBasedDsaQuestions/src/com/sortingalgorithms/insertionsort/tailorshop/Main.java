package com.sortingalgorithms.insertionsort.tailorshop;



public class Main {
	public static void main(String[] args) {
		OrdersSort orders = new OrdersSort();
		
		orders.addOrders(new Order("Shirt" , 5));
		orders.addOrders(new Order("Suit", 2));
		orders.addOrders(new Order("Kurta" , 4));
		orders.addOrders(new Order("Blazer", 8));
		
		orders.displayDetails();
	}
}
