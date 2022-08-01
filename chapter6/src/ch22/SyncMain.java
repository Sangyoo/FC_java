package ch22;

class Bank{
	
	private int money = 10000;
	
	/* 1. ����ȭ 1�� ���
	 * Thread�� synchronized �� ���� method�� �����ϴ� ����
	 *  this, �� �޼ҵ尡 ���Ե� ��ü(���⼭�� bank)�� lock�� �Ǵ�
	 *  �׷��� �� �޼��尡 ����Ǵ� ���� bank�� ������ ���´�.*/
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
		
		//2. ����ȭ 2�� ���
		//�� �޼��尡 ����Ǵ� ���� ��ü�� lock�� �ɾ��
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
		
		//3. ����ȭ 3�� ���(synchronization block : thread�� �ɱ� - 
		//��� ����ȭ ��ü ��Ȯ�� �����ϱ�
		//���⼱ SyncMain.myBank 
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
	
	//*����ȭ�� �ȵǾ��� ��*
	//park�� ���¿� 1������ �ִ� ���� ���� �Ŀ� m�� 1������ �����ϰ� 3�� ���鿡 ���.
	//parkwife�� park thread ���� 0.2�� �Ŀ� m�� 1������ �����ϰ�, �ٽ� 0.2�� �Ŀ�
	//9õ���� ���� �ܾ����� �����Ѵ�. park�� 3���� ������ ���� �� ������ m(10000��)��
	//������ �ݾ� 3000���� ���Ͽ� 13,000���� ���¿� �����Ѵ�.
	//�� critical section bank��� �ڿ��� ���������ؼ� �߻��� ���̴�.
	//�ڹٿ����� shared resource bank�� �̹� static���� ����Ǿ� ������ ����ȭ�� �ʿ���
	//method�� "synchronized" ���ľ ���δ�.
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
