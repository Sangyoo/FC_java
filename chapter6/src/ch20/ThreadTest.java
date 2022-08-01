package ch20;

//Thread를 자바에서 만드는 두가지 방법

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
		
		//기본적으로 main thread는 존재하고 있다.
		//여기서 main, th1, th2가 돌아가는데
		//main thread의 할 일은 thread 2개를 돌려놓는 것이
		//자기 할일의 끝이다.
		
		//1. thread를 extends 했을 때
//		System.out.println(Thread.currentThread() + "start");
//		MyThread th1 = new MyThread();
//		MyThread th2 = new MyThread();
//		
//		//start는 thread 클래스의 method이다.
//		//runnable을 implemenets 했을 때는 사용불가능
//		
//		th1.start();
//		th2.start();
//		Thread th1 = new Thread(runnable);
		
		//2. Runnable로 구현했을 때
		//: 여러 thread에 인수로 장착을 해서 돌릴 때
		System.out.println(Thread.currentThread());
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		
		System.out.println(Thread.currentThread() + "end");
		
		//3. 이것도 익명함수를 이용하여 thread를 생성하는 것
		//2의 방법과는 다르게 간단하게만 할 떄
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("run");
			}
			
		};
		run.run();
	}

}
