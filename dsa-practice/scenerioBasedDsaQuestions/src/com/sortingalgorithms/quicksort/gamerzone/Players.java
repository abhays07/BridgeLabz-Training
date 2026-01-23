package com.sortingalgorithms.quicksort.gamerzone;

public class Players {
	private String playerId;
	private int scores;
	
	public Players(String playerId, int scores) {
		this.playerId=playerId;
		this.scores=scores;
	}
	
	public String getPlayerid() {
		return playerId;
	}
	
	public int getScores() {
		return scores;
	}
	
	@Override
	public String toString() {
		return "Player Id : "+ playerId +" | Score : "+ scores;
	}
}
