package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber mn = (x,y) -> {return x>y ? x : y;} ;
		
		System.out.println(mn.getMax(23, 23));
	}

}
