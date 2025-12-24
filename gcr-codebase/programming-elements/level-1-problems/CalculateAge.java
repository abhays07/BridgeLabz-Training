public class CalculateAge{
	public static int age(int b, int c){
		int currentAge = c-b;
		return currentAge;
	}
	public static void main(String [] args){
		
		int birthYear = 2000;
		int currentYear=2024;
		
		System.out.println("Harry's age in "+ currentYear +" is : " + age(birthYear, currentYear));
	}
}