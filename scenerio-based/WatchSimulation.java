/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
 */

public class WatchSimulation {
	public static void lunchBreak() {
		System.out.println("Digital Watch Started");
		
		for (int hours=0; hours<24; hours++) {
			for (int minute =0; minute<60; minute++) {
				System.out.printf("%2d : %2d\n", hours, minute);
				
				if(hours==13 && minute == 0) {
					System.out.println("Lunch Break");
					break;
				}
			}
			if(hours==13) {
				break;
			}
		}	
	}
	public static void main(String[] args) {
		lunchBreak();
	}

}
