package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bq = new BookShelf();
		bq.enQueue("����1");
		bq.enQueue("����2");
		bq.enQueue("����3");
		bq.enQueue("����4");
		bq.enQueue("����5");
		
		System.out.println(bq.getSize());
		System.out.println(bq.deQueue());
		System.out.println(bq.getSize());
	}

}
