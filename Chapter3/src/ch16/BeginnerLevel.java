package ch16;

public class BeginnerLevel extends PlayerLevel{
	
	String gameLevel = "Beginner";
	@Override
	void run() {
		System.out.println("õõ�� �޸��ϴ�");
		
	}

	@Override
	void jump() {
		System.out.println("jump ��������");
	}

	@Override
	void turn() {
		System.out.println("turn ��������");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("****** �ʱ��� �����Դϴ� ******");
	}

	
}
