package ch09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String ClassName) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(ClassName);
		
		return c;
		
	}

	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "abc");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} /*catch(Exception e) {
			//모든 exception의 최상위 맨 위에다 쓰지말자... 어떤 excpetion이든 걸리기때문에
			
		}*/
	}

}
