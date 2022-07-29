package chapter2v6;

public class Order {
	int orderNumber;
	int pNumber;
	String orderAddress;
	int orderDate;
	int orderTime;
	int orderPrice;
	int orderMenuNumber;
	
	public Order(int orderNumber,
	int pNumber,
	String orderAddress,
	int orderDate,
	int orderTime,
	int orderPrice,
	int orderMenuNumber) {
		this.orderNumber = orderNumber;
		this.pNumber = pNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		
	}
}
