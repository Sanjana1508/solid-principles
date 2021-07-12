package ViolateSolidPrinciples;

public class StockOrderBuySell implements StockOrder {

	@Override
	public String toString() {
		return "StockOrderBuySell [id=" + id + ", comapnyName=" + comapnyName + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	int id;
	String comapnyName;
	double quantity;
	double price;
	
	public StockOrderBuySell(int id,String companyName,double quantity,double price) {
		this.id=id;
		this.comapnyName=companyName;
		this.quantity=quantity;
		this.price=price;
	}

	
	@Override
	public void buy() {
		System.out.println("Stock  Purchase Order is placed");

	}

	@Override
	public void sell() {
		System.out.println("Stock Sell Order is Placed");

	}

	//violation of single responsibility principle
}
