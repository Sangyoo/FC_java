package ch16;

public class RoundRobin implements Scheduler{

	@Override
	public void sendCallToAgent() {
		System.out.println("ooo상담원에게 배분될 차례입니다.");
		System.out.println("상담원 ooo에게 배분합니다");
		System.out.println("상담원에게 배분이 완료되었습니다.");
		System.out.println("--------------------------------------");
	}

}
