package com.foreach.stockpricelogger;

import java.util.ArrayList;
import java.util.List;

public class DisplayStockPrice {
	public static void main(String[] args) {
		List<Stock> stocks = new ArrayList<>();

		stocks.add(new Stock("AAPL", 189.45));
		stocks.add(new Stock("GOOGL", 142.30));
		stocks.add(new Stock("AMZN", 172.10));
		stocks.add(new Stock("MSFT", 415.60));
		stocks.add(new Stock("TSLA", 198.75));
		stocks.add(new Stock("META", 487.20));
		stocks.add(new Stock("NFLX", 612.40));
		stocks.add(new Stock("NVDA", 895.30));
		stocks.add(new Stock("ORCL", 118.90));
		stocks.add(new Stock("INTC", 43.25));
		
		
		for(Stock stock : stocks) {
			System.out.println(stock);
		}
	}
}
