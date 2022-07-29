package ch10;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	
	void startCar(){
		System.out.println("시동을 켭니다.");
	}
	
	void turnOff(){
		System.out.println("시동을 끕니다.");
	}
	
	void washCar() {
		
	}
	
	final void run(){
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
