package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException e) {//FileInputStream ��Ȳ�� ���� exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {//close ��Ȳ�� ���� exception
				e.printStackTrace();
			} catch (Exception e2) {//null ��Ȳ�� ���� exception
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}

}