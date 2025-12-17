public class KmToMiles {
	public static double conversion (double km){
		double miles = km*1.6;
		return miles;
	}
	public static void main(String [] args){
		double km = 10.8;
		System.out.println("The distance " + km + "in miles is : " + conversion(km));
	
	}
 }