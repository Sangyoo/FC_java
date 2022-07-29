package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(powder);
		
		//(powder) powderPrinter.getMaterial(); 처럼 형변환 필요없음 - 컴파일러가 class파일의 type을 다 바꿔줌
		Powder p = powderPrinter.getMaterial();
		
	}

}
