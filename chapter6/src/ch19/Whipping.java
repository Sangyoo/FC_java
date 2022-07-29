package ch19;

public class Whipping extends Decorator {

	public Whipping(Coffee coffee) {
		super(coffee);
	}
	public void brewing() {
		coffee.brewing();
		System.out.println("adding whipping cream");
	}

}
