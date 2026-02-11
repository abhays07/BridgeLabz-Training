package com.junit.advancedquestion;


import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest{

	@Test
	public void test_deposit_ValidAmount(){
		Program account = new Program(1000.0);
		
		account.deposit(500.0);
		
		assertEquals(1500.0, account.getBalance(),0.0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_deposit_NegativeAmount() {
		Program account = new Program(20000);
		
		account.deposit(-230);
		
	}
	
	@Test
	public void test_withdraw_ValidAmount() {
		Program account = new Program(10000);
		
		account.withdraw(500);
		
		assertEquals(9500.0, account.getBalance(),0.0);
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void test_withdraw_InsufficientFunds() {
		Program account = new Program(100);
		account.withdraw(200);
		
	}


	
}
