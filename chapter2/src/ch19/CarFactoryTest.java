package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();	
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNumber()); //10001출력
		System.out.println(yourSonata.getCarNumber()); //10002출력
	}

}
