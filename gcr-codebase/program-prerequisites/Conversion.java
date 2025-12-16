import java.util.*;
class Conversion {
		
		public static double convertToFehrenhite(int a){
			int Fahrenheit = (a * 9/5) + 32;
return Fahrenheit;			
		}
		public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the temperature in celsius");
			int a = sc.nextInt();
			double result = convertToFehrenhite(a);
			System.out.println("The temperature in Fehranhite is : " + result);
			
			
			
		}
}