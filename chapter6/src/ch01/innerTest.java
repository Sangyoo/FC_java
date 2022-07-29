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
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	public void usingClass(){
		inClass.inTest(); //���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		void inTest(){
			System.out.println("InClass num = " +iNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
	}
}

public class innerTest {

	public static void main(String[] args) {
		/*
		 * OutClass oc = new OutClass();
		oc.usingClass();
		
		//���� Ŭ���� ��������
		OutClass.InClass ic = oc.new InClass();
		ic.inTest();
		*/
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
		
	}

}
