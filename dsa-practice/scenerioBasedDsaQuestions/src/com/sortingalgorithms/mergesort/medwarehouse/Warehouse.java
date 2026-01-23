package com.sortingalgorithms.mergesort.medwarehouse;

import java.util.ArrayList;
import java.util.List;

import com.sortingalgorithms.mergesort.examcell.MergeSort;

public class Warehouse {
	ArrayList<Medicine> medicines = new ArrayList<Medicine>();
	
	// Add New Medicine to list
	public void addMedicine(Medicine newMedicine) {
		medicines.add(newMedicine);
	}
	
	public void sortByExpiry() {
		if(medicines.size()>1) {
			mergeSort(medicines);
		}
	}
	public void mergeSort(ArrayList<Medicine> medicines) {
		if(medicines.size()<=1) {
			return;
		}
		
		int mid = medicines.size()/2;
		
		ArrayList<Medicine> left = new ArrayList<Medicine>(medicines.subList(0, mid));
		ArrayList<Medicine> right = new ArrayList<Medicine>(medicines.subList(mid, medicines.size()));
		
		mergeSort(left);
		mergeSort(right);
		
		merge(medicines, left, right);
		
	}
	// Merge two sorted sublists
    private void merge(ArrayList<Medicine> result,
                       ArrayList<Medicine> left,
                       ArrayList<Medicine> right) {

        int i = 0, j = 0, k = 0;

        // Merge based on expiry date
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getExpiryDate()
                    .isBefore(right.get(j).getExpiryDate())) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements
        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
    
 // Display sorted medicines
    public void displayMedicines() {
        System.out.println("\nMedicines Sorted by Expiry Date:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
