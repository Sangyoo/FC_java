package ch16;

public class SuperLevel extends PlayerLevel {
	
	@Override
	void run() {
		System.out.println("��û ������ �޸��ϴ�");
		
	}

	@Override
	void jump() {
		System.out.println("���� ���� �Ͽ����ϴ�");
	}

	@Override
	void turn() {
		System.out.println("�� �Ͽ����ϴ�.");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ� ******");
	}

}
