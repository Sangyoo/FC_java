package ch19;

public class Latte extends Decorator{
	
	//상위 클래스인 decorator가 default constructor가 없기
	//때문에 하위클래스 latte는 매개변수가 있는 super를 호출하여
	//construct 해야 한다.
	public Latte(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding milk");
	}
}
