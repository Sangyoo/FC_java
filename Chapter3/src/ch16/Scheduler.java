package ch16;

public interface Scheduler {
	public default void getNextCall() {
		System.out.println("���� ���� ����� ��⿭�� �ֽ��ϴ�.");
	}
	public void sendCallToAgent();
}
