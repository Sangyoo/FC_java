package ch20;

//Thread�� �ڹٿ��� ����� �ΰ��� ���

//1. extends Thread :

//class MyThread extends Thread{
//	
//	public void run() {
//		
//		int i;
//		for(i=1; i<=10; i++) {
//			System.out.print(i +"\t");
//		}
//	}
//}

//2. runnable :
class MyThread implements Runnable{
	
	public void run() {
		int i;
		for(i=1; i<=10; i++) {
			System.out.print(i +"\t");
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		
		//�⺻������ main thread�� �����ϰ� �ִ�.
		//���⼭ main, th1, th2�� ���ư��µ�
		//main thread�� �� ���� thread 2���� �������� ����
		//�ڱ� ������ ���̴�.
		
		//1. thread�� extends ���� ��
//		System.out.println(Thread.currentThread() + "start");
//		MyThread th1 = new MyThread();
//		MyThread th2 = new MyThread();
//		
//		//start�� thread Ŭ������ method�̴�.
//		//runnable�� implemenets ���� ���� ���Ұ���
//		
//		th1.start();
//		th2.start();
//		Thread th1 = new Thread(runnable);
		
		//2. Runnable�� �������� ��
		//: ���� thread�� �μ��� ������ �ؼ� ���� ��
		System.out.println(Thread.currentThread());
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		
		System.out.println(Thread.currentThread() + "end");
		
		//3. �̰͵� �͸��Լ��� �̿��Ͽ� thread�� �����ϴ� ��
		//2�� ������� �ٸ��� �����ϰԸ� �� ��
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("run");
			}
			
		};
		run.run();
	}

}
