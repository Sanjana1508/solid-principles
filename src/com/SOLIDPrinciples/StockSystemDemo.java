package com.SOLIDPrinciples;

public class StockSystemDemo {

	public static void main(String[] args) {
		StockOrderToBuy stockToBuy=new StockOrderToBuy(1,"ABC",200,50000);
		
		BrokerBuys brokerBuys=new BrokerBuys();
		
		Card card = new MasterCard("544532678901","MasterCard","James","12-12-2022");
		
		TraderBuys traderBuys=new TraderBuys(brokerBuys,card);
		
		traderBuys.buy(stockToBuy);
		
		System.out.println();
		
		StockOrderToSell stockToSell=new StockOrderToSell(2,"XYZ",100,150000);
		
		BrokerSells brokerSells=new BrokerSells();
		
		TraderSells traderSells=new TraderSells(brokerSells,new PayPal());
		
		traderSells.sell(stockToSell);
	}

}
