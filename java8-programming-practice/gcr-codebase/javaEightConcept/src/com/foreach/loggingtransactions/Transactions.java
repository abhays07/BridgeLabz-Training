package com.foreach.loggingtransactions;

import java.security.Identity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transactions {
	public static void main(String[] args) {
		List<String> transactionIds = new ArrayList<>();

		transactionIds.add("TXN1001");
		transactionIds.add("TXN1002");
		transactionIds.add("TXN1003");
		transactionIds.add("TXN1004");
		transactionIds.add("TXN1005");
		transactionIds.add("TXN1006");
		transactionIds.add("TXN1007");
		transactionIds.add("TXN1008");
		transactionIds.add("TXN1009");
		transactionIds.add("TXN1010");

		transactionIds.forEach(id -> 
		System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}
}
