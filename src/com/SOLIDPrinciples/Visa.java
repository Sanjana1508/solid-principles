package com.SOLIDPrinciples;

import java.util.Date;

public class Visa extends Card{
	public Visa(String cardNumber, String cardType, String nameOnCard, String expDate) {
		super(cardNumber, cardType, nameOnCard, expDate);
	}

	@Override
	public void processPayment(StockOrder stock) {
		//payment specific code
		
		System.out.println("Payment done through VisaCard "+cardNumber+" by "+nameOnCard);
	}

}
