import java.util.Scanner;
/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/
public class DiscountDashboard {
	public static void calculateDiscount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of items");
		int totalItems = sc.nextInt();
		double total[]= new double[totalItems];
		System.out.println("Enter the price of each items : ");
		for(int i=0; i<totalItems; i++) {
			System.out.println("Enter Price of "+ (i+1) + " item");
			total[i]= sc.nextDouble();
		}
		double totalPrice =0;
		for(int i=0; i<totalItems; i++) {
			totalPrice+=total[i];
		}
		System.out.println("================================================");
		System.out.println("The Total Bill Is : " + totalPrice + "RS");
		double discountedBill;
		if(totalPrice> 5000) {
			discountedBill= totalPrice - (totalPrice*0.1);
			System.out.println("Congratulations you got 10% discount on purchasing items over 5000 RS ");
			System.out.println("Your discounted bill is : "+ discountedBill + "RS");
			System.out.println("================================================");
		}
		
		else if(totalPrice> 2000 && totalPrice <5000) {
			discountedBill= totalPrice - (totalPrice*0.05);
			System.out.println("Congratulations you got 5% discount on purchasing items over 2000 RS ");
			System.out.println("Your discounted bill is : "+ discountedBill + "RS");
			System.out.println("================================================");
		}
		else if(totalPrice>1000 && totalPrice<2000) {
			discountedBill= totalPrice-(totalPrice*0.02);
			System.out.println("Congratulations you got 2% discount on purchasing items over 1000 RS ");
			System.out.println("Your discounted bill is : "+ discountedBill + "RS");
			System.out.println("================================================");
		}
		else {
			System.out.println("Discount not Applicable");
			System.out.println("The Total Bill Is : " + totalPrice + "RS");
			System.out.println("================================================");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("  WELCOME TO THE BILLING COUNTER ");
		System.out.println("====================================");
		
		System.out.println("           DISCOUNT DETAILS           ");
		System.out.println(" ------------------------------------------------------");
		System.out.println(" Get 10% discount on purchasing items over rs 5000RS");
		System.out.println(" Get 5% discount on purchasing items over rs 2000RS");
		System.out.println(" Get 2% discount on purchasing items over rs 1000RS");
		System.out.println(" ------------------------------------------------------");
		calculateDiscount();
	}

}
