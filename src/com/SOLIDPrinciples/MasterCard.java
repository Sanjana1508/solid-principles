package com.SOLIDPrinciples;

import java.util.Date;

public class MasterCard extends Card{
	public MasterCard(String cardNumber, String cardType, String nameOnCard, String expDate) {
		super(cardNumber, cardType, nameOnCard, expDate);
	}

	

	@Override
	public void processPayment(StockOrder stock) {
		//payment specific code
		System.out.println("Payment done through MasterCard "+cardNumber+" by "+nameOnCard);
	}
}
