package com.SOLIDPrinciples;

public class TraderSells {
	BrokerSell broker;
	PaymentGateway payment;
	
	public TraderSells(BrokerSell broker,PaymentGateway payment) {
		this.broker=broker;
		this.payment=payment;
	}
	
	public void sell(StockOrder stock) {
		System.out.println("Sell Order is taken by Broker");
		this.broker.sell(stock);
		this.payment.processPayment(stock);
	}
}
