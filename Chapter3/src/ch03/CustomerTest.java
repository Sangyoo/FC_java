package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.customerName = "?̼???";
		customer1.customerId = 10010;
		customer1.bonusPoint = 1000;
		System.out.println(customer1.showCustomerInfo());
		
		VIPCustomer customer3 = new VIPCustomer();
		customer3.customerName = "??????";
		customer3.bonusPoint = 10000;
		System.out.println(customer3.showCustomerInfo());
	}
}
