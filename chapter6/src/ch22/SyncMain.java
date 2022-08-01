package ch22;

class Bank{
	
	private int money = 10000;
	
	/* 1. 동기화 1번 방법
	 * Thread가 synchronized 가 붙은 method를 실행하는 동안
	 *  this, 이 메소드가 포함된 객체(여기서는 bank)에 lock을 건다
	 *  그래서 이 메서드가 수행되는 동안 bank에 접근을 막는다.*/
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		System.out.println("m is : "+m);
		
		try {
			Thread.sleep(3000);
			System.out.println("park woke up after 3s");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
		System.out.println("park saved 3000!");
	}
	
	public synchronized void minusMoney(int minus){
		int m = getMoney();
		System.out.println("m is : "+m);
		
		//2. 동기화 2번 방법
		//이 메서드가 수행되는 동안 객체에 lock을 걸어라
		synchronized (this) {
			
			try {
				Thread.sleep(200);
				System.out.println("wife woke up after 0.2s");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m-minus);
			System.out.println("wife withdrew 1000!");
		}
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{
	
	public void run() {
		
		//3. 동기화 3번 방법(synchronization block : thread에 걸기 - 
		//대신 동기화 객체 정확히 지정하기
		//여기선 SyncMain.myBank 
		synchronized (SyncMain.myBank) {
			System.out.println("start save");
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		}
		
	}
}

class ParkWife extends Thread{
	public void run() {
			
		synchronized (SyncMain.myBank) {
			System.out.println("start spend");
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		}
	}
}
public class SyncMain {
	
	//*동기화가 안되었을 때*
	//park이 계좌에 1만원이 있는 것을 학인 후에 m에 1만원을 저장하고 3초 숙면에 든다.
	//parkwife가 park thread 시작 0.2초 후에 m에 1만원을 저장하고, 다시 0.2초 후에
	//9천원을 계좌 잔액으로 저장한다. park은 3초의 숙면이 끝난 후 원래의 m(10000원)에
	//저장할 금액 3000원을 더하여 13,000원을 계좌에 저장한다.
	//즉 critical section bank라는 자원을 공동점유해서 발생한 일이다.
	//자바에서는 shared resource bank는 이미 static으로 선언되어 있으며 동기화가 필요한
	//method에 "synchronized" 수식어를 붙인다.
	public static Bank myBank = new Bank();
	
	
	public static void main(String[] args) {
		
		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		
		pw.start();
		
		
	}

}
