package com.sortingalgorithms.mergesort.zipzipmart;

import java.time.LocalDate;

public class Transaction {
	LocalDate date;
	int amount;
	
	
	public Transaction(LocalDate date, int amount) {
		this.date=date;
		this.amount =amount;
	}
	
	@Override
	public String toString() {
		return date+ " -> " + amount;
	}
	
}
