package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest11 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ��� ���� enter�� ��������");
		
		int i;
		
		try {
			//InputStreamReader��� ����Ʈ��Ʈ���� �о� ���ڷ� �ٲ��ִ� ���� ��Ʈ��. 
			//system in�̶�� ��Ʈ���� ���� �����̴�.
			//������ ǥ���Է� ����Ʈ ��Ʈ���� �޾����� �����Է� ����Ʈ ��Ʈ���� �����ϴ�.
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
				System.out.println((char) i); 
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
