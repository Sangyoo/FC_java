package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	//buffer�� ���õ� stream���� .readLine();�̶�� \n�� ���ö����� �д� �޼��尡 �ִ�.
	public static void main(String[] args) {
		long ms = 0;
		//���ν�Ʈ���� inputstream�̱� ������ bufferedInputstream�̶�� ������Ʈ���� ���
		//������ reader���ٸ� bufferedReader�� ���(stream ������ �°�)
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
		System.out.println(ms + " �ҿ�Ǿ����ϴ�.");
	}

}
