package ch16;
/* 한줄씩 옮기기 : 커서를 코드의 첫칸에 놓고 Alt키를 누르고 방향키(위, 아래)로 움직인다.
 * 한줄 복사 : 커서를 코드 첫칸에 놓고 Ctrl +Alt키를 누르고 방향키(위,아래)로 움직인다.
 * 한줄 제거 : 커서를 코드 첫칸에 놓고 Ctrl + D키를 누른다. 
 * 자원찾기 : Ctrl + Shift + R
 * 찾기: Ctrl + H
 * java 코드를 자동으로 편집해주는 단축키가 있다.
 * eclipse 자동편집기능 단축키는 Ctrl + Shift + F 키 이다.
 * 들여쓰기 등등.. 자동으로 편집해준다.
 * Setter 메소드 자동생성Alt + Shift + s --> Generate Getters and Setters 선택
 * 
 */

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		
		/*static method 에서는 인스턴스가 메모리에 생성되지 않았을 수도 있기 때문에
		 * employeeName = " Lee " 와 같은 인스턴스 변수 사용이나 할당이 불가능하다.*/
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
