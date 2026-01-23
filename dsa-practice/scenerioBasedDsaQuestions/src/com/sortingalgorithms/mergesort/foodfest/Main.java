package com.sortingalgorithms.mergesort.foodfest;

public class Main {
	
	public static void main(String[] args) {
		Stall [] stalls = {
				new Stall("Pizza Hut", 100),
				new Stall("Domino's" , 200),
				new Stall("Do-Bhai Egg roll", 50),
				new Stall("Chat Corner", 120)
		};
		
		System.out.println("Before Sorting Zone Data");
		for(Stall stall : stalls) {
			System.out.println(stall);
		}
		
		// Apply Merge Sort
		FoodFestSort.mergeSort(stalls, 0, stalls.length-1);
		
		System.out.println("After Sorting by Customer Footfall: ");
		for(Stall stall : stalls) {
			System.out.println(stall);
		}
	}
}
