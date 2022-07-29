package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etiopia = new EtiopiaAmericano();
		
		etiopia.brewing();
		
		System.out.println();
		Coffee etiatte = new Latte(etiopia);
		etiatte.brewing();
		System.out.println();
		Coffee mochafee = new Mocha(new Latte(new EtiopiaAmericano()));
		mochafee.brewing();
		System.out.println();
		Coffee whipped = new Whipping(new Latte(new KenyaAmericano()));
		whipped.brewing();
	}

}
