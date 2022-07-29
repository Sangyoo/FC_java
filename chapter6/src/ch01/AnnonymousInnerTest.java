package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		
		/*
		 * return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
		*/
		
		class MyRunnable implements Runnable {
			
			int localNum = 1000;

			@Override
			public void run() {
				//num = 200;   //에러 남
				//i = 10;      //에러 남
				System.out.println(i);
				System.out.println(num);
				}
			}
			
		return new MyRunnable();
	}
	Runnable runner = new Runnable() {
	
	@Override
	public void run() {
		System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};
}

public class AnnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
	}

}
