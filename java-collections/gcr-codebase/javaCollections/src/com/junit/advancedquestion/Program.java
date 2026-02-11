package com.junit.advancedquestion;

class Program{
	double balance = 0.0;
	
	public Program(double initialBalance){
		this.balance = initialBalance;
	}
	
	public void deposit(double amount){
		if(amount<=0){
			throw new IllegalArgumentException("Deposit amount cannot be negative");
		}
		balance+=amount;
	}
	
	public void withdraw(double amount){
		if(amount>balance){
			throw new IllegalArgumentException("Insufficient Balance");
		}
		balance-=amount;
	}
	public double getBalance(){
		return balance;
	}
}