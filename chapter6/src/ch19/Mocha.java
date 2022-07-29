package ch19;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		coffee.brewing();
		System.out.println("adding mocha syrup");
	}

}
