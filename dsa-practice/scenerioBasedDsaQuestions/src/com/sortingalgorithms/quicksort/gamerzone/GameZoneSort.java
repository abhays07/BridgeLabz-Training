package com.sortingalgorithms.quicksort.gamerzone;

public class GameZoneSort {
	
	// Quick Sort Method
	public static void quickSort(Players [] players, int low, int high) {
		if(low<high) {
			// Partition Index 
			int pivotIndex = partition(players, low, high);
			
			// Sort elements before and after partition
			quickSort(players, low, pivotIndex-1);
			quickSort(players, pivotIndex+1, high);
		}
	}
	
	// Partition logic for Quick Sort
	public static int partition(Players[] players, int low, int high) {
		// Choose last element as pivot
		int pivotScore = players[high].getScores();
		int i = low-1;
		
		// Rearrange elements based on pivot
		for(int j=low; j<high; j++) {
			// Descending order (High Score first)
			if(players[j].getScores()>pivotScore) {
				i++;
				swap(players, i, j);
			}
		}
		swap(players, i+1, high);
		return i+1;
	}
	
	private static void swap(Players[]players , int i, int j) {
		Players temp = players[i];
		players[i]= players[j];
		players[j]=temp;
		
	}
}
