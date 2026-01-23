package com.sortingalgorithms.mergesort.foodfest;

public class Stall {
	private String stallName;
	private int footfall;
	
	public Stall(String stallName, int footfall) {
		this.stallName=stallName;
		this.footfall=footfall;
	}
	
	public String getStallName() {
		return stallName;
	}
	
	public int getFootfall() {
		return footfall;
	}
	
	@Override
	public String toString() {
		return "Stall Name : " + stallName + " | FootFall : " + footfall;
		
	}
}
