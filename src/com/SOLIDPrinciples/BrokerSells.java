package com.SOLIDPrinciples;

public class BrokerSells implements BrokerSell{

	@Override
	public void sell(StockOrder stock) {
		System.out.println("Broker placing sell order on "+stock);
		stock.placeOrder();
	}
	
}
