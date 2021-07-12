package ViolateSolidPrinciples;

public class CardType extends Card implements PaymentGateway {

	public CardType(String cardNumber, String cardType, String nameOnCard, String expDate) {
		super(cardNumber, cardType, nameOnCard, expDate);
	}

	@Override
	public void processPayment(StockOrderBuySell stock) {
		switch(cardType) {
			case "MasterCard":System.out.println("Payment done through MasterCard "+cardNumber+" by "+nameOnCard);
							  break;
			case "Visa":System.out.println("Payment done through VisaCard "+cardNumber+" by "+nameOnCard);
						break;
	}

	}
	
	//violation of liskov substitution principle
	
	//violation of open-closed principle
	
	//violation of dependency inversion principle

}
