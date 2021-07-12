package com.SOLIDPrinciples;

public class StockOrderToBuy implements StockOrder{
	int id;
	String comapnyName;
	double quantity;
	double price;
	
	public StockOrderToBuy(int id,String companyName,double quantity,double price) {
		this.id=id;
		this.comapnyName=companyName;
		this.quantity=quantity;
		this.price=price;
	}

	
	
	@Override
	public String toString() {
		return "StockOrderToBuy [id=" + id + ", comapnyName=" + comapnyName + ", quantity=" + quantity + ", price="
				+ price + "]";
	}



	@Override
	public void placeOrder() {
		System.out.println("Stock  Purchase Order is placed");
		
	}
	
	
}
