package ch01;

import ch01.OutClass.InClass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
		void inTest(){
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass(){
		inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		void inTest(){
			System.out.println("InClass num = " +iNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class innerTest {

	public static void main(String[] args) {
		/*
		 * OutClass oc = new OutClass();
		oc.usingClass();
		
		//내부 클래스 생성문법
		OutClass.InClass ic = oc.new InClass();
		ic.inTest();
		*/
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
		
	}

}
