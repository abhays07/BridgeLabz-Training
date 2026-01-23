package com.sortingalgorithms.quicksort.gamerzone;

public class Main {
	public static void main(String[] args) {
		Players[] players = {
				new Players("Abhay", 500),
				new Players("thankss", 685),
				new Players("Amber", 320),
				new Players("Gola", 670),
		};
		
		System.out.println("Before Sorting : ");
		for(Players p : players) {
			System.out.println(p);
		}
		
	
	 GameZoneSort.quickSort(players, 0, players.length-1);
		
		System.out.println("After Sorting : ");
		for(Players p : players) {
			System.out.println(p);
		}
		
		
		
	}
}
