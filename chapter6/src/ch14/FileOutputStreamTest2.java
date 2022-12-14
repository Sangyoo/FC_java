package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	
	public static void main(String[] args) throws FileNotFoundException {
		//FileOutputStream("output.txt", true) true의 의미는 append(덮어쓰기 x, 붙여서 계속작성한다는 듯)
		//append의 기본값은 false 이다.
		FileOutputStream fos = new FileOutputStream("output.txt", true);
		try(fos){
			
			byte[]	bs = new byte[26];
			
			byte data = 65;
			for(int i=0; i < bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs,2,10);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
