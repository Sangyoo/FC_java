package ch16;

public interface Scheduler {
	public default void getNextCall() {
		System.out.println("현재 들어온 상담을 대기열에 넣습니다.");
	}
	public void sendCallToAgent();
}
