package ch19;

public class Latte extends Decorator{
	
	//���� Ŭ������ decorator�� default constructor�� ����
	//������ ����Ŭ���� latte�� �Ű������� �ִ� super�� ȣ���Ͽ�
	//construct �ؾ� �Ѵ�.
	public Latte(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding milk");
	}
}
