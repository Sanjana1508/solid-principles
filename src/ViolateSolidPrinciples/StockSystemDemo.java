package ViolateSolidPrinciples;


public class StockSystemDemo {

	public static void main(String[] args) {
		StockOrderBuySell stockToBuy=new StockOrderBuySell(1,"ABC",200,50000);
		
		BrokerBuySell brokerBuy=new BrokerBuySell();
		
		Card card = new CardType("544532678901","MasterCard","James","12-12-2022");
		
		Trader traderBuy=new Trader(brokerBuy,card);
		
		traderBuy.buy(stockToBuy);
		
		System.out.println();
		
		StockOrderBuySell stockToSell=new StockOrderBuySell(2,"XYZ",100,150000);
		
		BrokerBuySell brokerSell=new BrokerBuySell();
		
		Trader traderSell=new Trader(brokerSell,new PayPal());
		
		traderSell.sell(stockToSell);
		
		//violation of dependency inversion principle

	}

}
