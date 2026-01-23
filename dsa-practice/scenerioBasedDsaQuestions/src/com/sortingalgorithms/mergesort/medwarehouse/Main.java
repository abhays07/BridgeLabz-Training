package com.sortingalgorithms.mergesort.medwarehouse;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Warehouse warehouse= new Warehouse();
		
		 warehouse.addMedicine(new Medicine("Paracetamol",
	                LocalDate.of(2025, 5, 20)));
	        warehouse.addMedicine(new Medicine("Cough Syrup",
	                LocalDate.of(2024, 12, 10)));
	        warehouse.addMedicine(new Medicine("Antibiotic",
	                LocalDate.of(2024, 8, 15)));
	        warehouse.addMedicine(new Medicine("Vitamin Tablets",
	                LocalDate.of(2026, 1, 5)));

	        warehouse.sortByExpiry();
	        warehouse.displayMedicines();
	}
}
