package ch10;

public class PasswordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}
	
	
/*setPassword 메소드 안에 조건에 따라 "throw new '오류문'"이 있다. 
 * 이것을 메소드를 쓰는 곳에서 오류를 받게 하는 것이 throws '오류문'이다*/
	public void setPassword(String password) throws PassWordException {
		if(password == null) {
			throw new PassWordException("비밀번호는 null 일 수 없습니다.");
		}
		
		else if (password.length() < 5) {
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if (password.matches("[a-zA-z]+")) {
			throw new PassWordException("비밀번호는 숫자나 특수무자를 포함해야 합니다.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String password = null;
		
		/*test.setPassword라는 메소드는 오류를 throws한다. (가능성이 있다.)
		 * 그래서 try-catch문으로 메소드의 오류 처리를 하는 것인데 
		 * 여기서는 PassWordExecption이라는 오류를 던지고 그것을 e로 받아
		 * getMessage라는 메소드를 통해 오류 메시지를 출력하는 것이다*/
		try {
			test.setPassword(password);
			System.out.println("오류없음1");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde1#";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
