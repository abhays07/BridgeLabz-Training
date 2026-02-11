package com.junit.advancedquestion;

class MainJava{
	public static void main (String [] args) {
		Program p1 = new Program(2000.89);
		try{
		p1.deposit(1000.50);
		p1.withdraw(200.50);
		p1.deposit(-364.847);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	
		System.out.println(p1.getBalance());
	}
}
