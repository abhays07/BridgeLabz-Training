package com.foreach.stockpricelogger;

public class Stock {

	private String symbol;
	private double price;

	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	// Getter for stock symbol
	public String getSymbol() {
		return symbol;
	}

	// Getter for stock price
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", price=" + price + "]";

	}

}
