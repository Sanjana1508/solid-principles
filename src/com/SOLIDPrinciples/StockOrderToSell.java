package com.SOLIDPrinciples;

public class StockOrderToSell implements StockOrder{
	int id;
	String name;
	double quantity;
	double price;
	
	public StockOrderToSell(int id,String name,double quantity,double price) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}

	@Override
	public String toString() {
		return "StockOrderToSell [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public void placeOrder() {
		System.out.println("Stock Sell Order is Placed");
		
	}
	
	
}
