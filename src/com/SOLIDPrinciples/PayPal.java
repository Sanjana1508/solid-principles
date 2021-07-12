package com.SOLIDPrinciples;

public class PayPal implements PaymentGateway{
	@Override
	public void processPayment(StockOrder stock) {
		//payment specific code
		System.out.println("Payment done through PayPal");
	}
}
