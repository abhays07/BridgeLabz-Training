import java.util.*;

// 6. Parking Lot Gate System 🚗
// Develop a smart parking system.
// ● Options: Park, Exit, Show Occupancy
// ● Use switch-case for the menu.
// ● while loop to continue until the parking lot is full or the user exits.

public class SmartParking{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int space = 3;
			
		while(true){
			System.out.println("If you want to use our service type 'use' and for exit type 'exit' ");
			String input = sc.next();
			if (input.equalsIgnoreCase("exit")){
				System.out.println("Thank you for using our service");
				break;
			}
			  if (!input.equalsIgnoreCase("use")) {
	                System.out.println("Invalid input. Please type 'use' or 'exit'.");
	                continue;
	            }
			if (space==0){
				System.out.println("All space booked. Thank you for using our service");
				break;
			}

		System.out.println("Choose Service");
		System.out.println("1 : Park " );
		System.out.println("2 : show availability  " );
		System.out.println("3 : Exit " );
		int choice = sc.nextInt();
		
		
		switch(choice){
			case 1 : 
			System.out.println("Vehicle Parked successfully");
			space--;
			break;
			case 2 :
			System.out.println("The remaining space is : " + space);
			break;
			case 3 :
			System.out.println("Thank you for using our service");
			System.exit(0);
			break;
			default : 
			System.out.println("Please Enter Correct Input");
		}
		
		
		}
	}
}