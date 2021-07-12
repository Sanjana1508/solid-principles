package ViolateSolidPrinciples;


public interface Broker {
	public void buy(StockOrderBuySell stock);
	
	public void sell(StockOrderBuySell stock);
	
	//violation of interface segregation principle
	
	//violation of dependency inversion principle
}
