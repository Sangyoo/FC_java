package ch19;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private static int carNum = 10001;
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance(){
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		car.carNumber = carNum;
		carNum++;
		return car;
	}
	
}
