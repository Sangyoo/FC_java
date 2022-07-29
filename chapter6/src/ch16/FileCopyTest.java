package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	//buffer와 관련된 stream에는 .readLine();이라는 \n이 나올때까지 읽는 메서드가 있다.
	public static void main(String[] args) {
		long ms = 0;
		//메인스트림이 inputstream이기 때문에 bufferedInputstream이라는 보조스트림을 사용
		//메인이 reader였다면 bufferedReader를 사용(stream 종류에 맞게)
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
			ms = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			ms = System.currentTimeMillis() - ms;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(ms + " 소요되었습니다.");
	}

}
