package ch10;

public class PasswordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}
	
	
/*setPassword �޼ҵ� �ȿ� ���ǿ� ���� "throw new '������'"�� �ִ�. 
 * �̰��� �޼ҵ带 ���� ������ ������ �ް� �ϴ� ���� throws '������'�̴�*/
	public void setPassword(String password) throws PassWordException {
		if(password == null) {
			throw new PassWordException("��й�ȣ�� null �� �� �����ϴ�.");
		}
		
		else if (password.length() < 5) {
			throw new PassWordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}
		else if (password.matches("[a-zA-z]+")) {
			throw new PassWordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String password = null;
		
		/*test.setPassword��� �޼ҵ�� ������ throws�Ѵ�. (���ɼ��� �ִ�.)
		 * �׷��� try-catch������ �޼ҵ��� ���� ó���� �ϴ� ���ε� 
		 * ���⼭�� PassWordExecption�̶�� ������ ������ �װ��� e�� �޾�
		 * getMessage��� �޼ҵ带 ���� ���� �޽����� ����ϴ� ���̴�*/
		try {
			test.setPassword(password);
			System.out.println("��������1");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("��������2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("��������3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde1#";
		
		try {
			test.setPassword(password);
			System.out.println("��������4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}