package ch09;

public class Desktop extends Computer{

	@Override
	void display() {
		System.out.println("desktop displayed");
	}

	@Override
	void typing() {
		System.out.println("typing displayed");
	}

}
