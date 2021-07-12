package ViolateSolidPrinciples;

public abstract class Card implements PaymentGateway {

	String cardNumber;
	String cardType;
	String nameOnCard;
	String expDate;
	
	public Card(String cardNumber, String cardType, String nameOnCard, String expDate) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.nameOnCard = nameOnCard;
		this.expDate = expDate;
	}
	
	
	public void validate(){
		//validation specific code
		if(nameOnCard==null || nameOnCard.isEmpty()) {
			throw new RuntimeException("Invalid card");
		}
	}

}
