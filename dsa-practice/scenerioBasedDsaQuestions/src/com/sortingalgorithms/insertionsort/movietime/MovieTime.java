package com.sortingalgorithms.insertionsort.movietime;

import java.util.ArrayList;

public class MovieTime {
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public void addMovie(Movie newMovie) {
		int i = movies.size()-1;
		
		while(i>=0 && movies.get(i).getShowTime() > newMovie.getShowTime()) {
			i--;	
		}
		movies.add(i+1, newMovie);
		System.out.println("Added: " + newMovie);
	}	
	
	public void displayShows() {
		System.out.println("\n Movie Show Listings: ");
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
}
