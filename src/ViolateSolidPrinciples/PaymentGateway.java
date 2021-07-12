package ViolateSolidPrinciples;


public interface PaymentGateway {
	public void processPayment(StockOrderBuySell stock);
	
	//violation of dependency inversion principle
}
