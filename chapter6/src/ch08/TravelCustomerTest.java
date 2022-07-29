package ch08;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);	

		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerHong);
		customerList.add(customerKim);
		customerList.add(customerLee);
		

		
		System.out.println("-----------고객 명단 출력-----------");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("-----------여행 비용 출력-----------");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("-----------20세 이상 고객----------");
//		customerList.stream().filter(c->c.getAge() >= 20).forEach(s->System.out.println(s));
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
