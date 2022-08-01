package ch21;


public class JoinTest extends Thread {
	int start;
	int end;
	int total;//멤버변수는 자동으로 0으로 초기화된다.
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start; i <=end ; i++) {
			total+=i;
		}
		
	}

	public static void main(String[] args) {
		JoinTest jt = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt.start();
		jt2.start();
		
		try {
			jt.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		int last = jt.total + jt2.total;
		System.out.println("jt1.total : " + jt.total );
		System.out.println("jt2.total : " + jt2.total);
		System.out.println("last total is : "+last);
	}

}
