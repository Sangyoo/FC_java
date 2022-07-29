package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cs = new Customer();
		cs.buy();
		cs.sell();
		cs.order();
		cs.hello();
		
		Buy buyer = cs;
		buyer.buy();
		buyer.order();
		
		Sell seller = cs;
		seller.sell();
		seller.order();
	}

}
