package com.SOLIDPrinciples;

public class TraderBuys {
		BrokerBuy broker;
		PaymentGateway payment;
		
		public TraderBuys(BrokerBuy broker,PaymentGateway payment) {
			this.broker=broker;
			this.payment=payment;
		}
		
		public void buy(StockOrder stock) {
			System.out.println("Purchase Order is taken by Broker");
			this.broker.buy(stock);
			this.payment.processPayment(stock);
		}

}
