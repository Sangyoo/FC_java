package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest11 {

	public static void main(String[] args) {
		
		System.out.println("알파벳을 쓰고 enter를 누르세요");
		
		int i;
		
		try {
			//InputStreamReader라는 바이트스트림을 읽어 문자로 바꿔주는 보조 스트림. 
			//system in이라는 스트림을 감싼 형태이다.
			//지금은 표준입력 바이트 스트림을 받았지만 파일입력 바이트 스트림도 가능하다.
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
				System.out.println((char) i); 
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
