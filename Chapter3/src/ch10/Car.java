package ch10;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	
	void startCar(){
		System.out.println("�õ��� �մϴ�.");
	}
	
	void turnOff(){
		System.out.println("�õ��� ���ϴ�.");
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
