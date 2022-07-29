package ch16;

public class PriorityAllocation implements Scheduler{

	@Override
	public void sendCallToAgent() {
		System.out.println("고객의 우선순위를 파악합니다.");
		System.out.println("우선순위에 맞는 상담원을 검색합니다.");
		System.out.println("상담원 ㅁㅁㅁ에게 배분합니다");
		System.out.println("상담원에게 배분이 완료되었습니다.");
		System.out.println("--------------------------------------");
	}

}
