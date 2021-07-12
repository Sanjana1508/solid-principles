package ViolateSolidPrinciples;

public class PayPal implements PaymentGateway {

	@Override
	public void processPayment(StockOrderBuySell stock) {
		//payment specific code
		System.out.println("Payment done through PayPal");

	}
	
	//violation of dependency inversion principle

}
