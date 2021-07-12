package ViolateSolidPrinciples;


public class BrokerBuySell implements Broker {

	@Override
	public void buy(StockOrderBuySell stock) {  //violation of dependency inversion principle
		System.out.println("Broker placing purchase order on "+stock);
		stock.buy();
		
	}

	@Override
	public void sell(StockOrderBuySell stock) { //violation of dependency inversion principle
		System.out.println("Broker placing sell order on "+stock);
		stock.sell();
	}

	//violation of 	single responsibility principle
	
	//violation of dependency inversion principles

}
