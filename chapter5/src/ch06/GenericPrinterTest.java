package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(powder);
		
		//(powder) powderPrinter.getMaterial(); ó�� ����ȯ �ʿ���� - �����Ϸ��� class������ type�� �� �ٲ���
		Powder p = powderPrinter.getMaterial();
		
	}

}
