package ch10;

public class ManualCar extends Car{

	@Override
	void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println("��ֹ� �տ��� ������ ����ϴ�.");
	}

	@Override
	void wiper() {
		
	}

}