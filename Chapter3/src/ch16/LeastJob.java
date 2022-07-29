package ch16;

public class LeastJob implements Scheduler{


	@Override
	public void sendCallToAgent() {
		System.out.println("상담원들의 건수를 검색합니다");
		System.out.println("제일 건수가 적은 상담원 xxx에게 배분합니다");
		System.out.println("상담원에게 배분이 완료되었습니다.");
		System.out.println("--------------------------------------");
	}

}
