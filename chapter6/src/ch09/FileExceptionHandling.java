package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		//FileInputStream fis = null;
		
		/* 무작정 try-catch 구문
		 * try {
			fis = new FileInputStream("a.txt");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("나는 공부를 열심히 한다");*/
		
		/*try - catch - finally 구문
		try {
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (NullPointerException e) {
				System.out.println(e);
			}
			System.out.println("finally");
		}
		System.out.println("나는 공부를 열심히 한다");
		*/
		
		
		//try 구문에서 사용 후 자동으로 리소스 해제. AutoClosable 인터페이스를 구현
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
