package com.sortingalgorithms.insertionsort.movietime;

public class Main {
	public static void main(String[] args) {
		MovieTime theatre = new MovieTime();
		
		theatre.addMovie(new Movie("Doraemon", 600));
		theatre.addMovie(new Movie("Avatar", 750));
		theatre.addMovie(new Movie("Shifa", 500));
		theatre.displayShows();
	}
}
