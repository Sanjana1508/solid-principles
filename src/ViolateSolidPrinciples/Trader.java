package ViolateSolidPrinciples;


public class Trader {
	BrokerBuySell broker;
	PaymentGateway payment;
	
	public Trader(BrokerBuySell broker,PaymentGateway payment) {
		this.broker=broker;
		this.payment=payment;
	}
	
	public void buy(StockOrderBuySell stock) {
		System.out.println("Purchase Order is taken by Broker");
		this.broker.buy(stock);
		this.payment.processPayment(stock);
	}
	
	public void sell(StockOrderBuySell stock) {
		System.out.println("Sell Order is taken by Broker");
		this.broker.sell(stock);
		this.payment.processPayment(stock);
	}
	
	//violation of single responsibility principle
	
	//violation of dependency inversion principle

}
