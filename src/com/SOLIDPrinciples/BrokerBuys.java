package com.SOLIDPrinciples;

public class BrokerBuys implements BrokerBuy{

	@Override
	public void buy(StockOrder stock) {
		System.out.println("Broker placing purchase order on "+stock);
		stock.placeOrder();
	}
		

}
