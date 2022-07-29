package ch16;
/* ���پ� �ű�� : Ŀ���� �ڵ��� ùĭ�� ���� AltŰ�� ������ ����Ű(��, �Ʒ�)�� �����δ�.
 * ���� ���� : Ŀ���� �ڵ� ùĭ�� ���� Ctrl +AltŰ�� ������ ����Ű(��,�Ʒ�)�� �����δ�.
 * ���� ���� : Ŀ���� �ڵ� ùĭ�� ���� Ctrl + DŰ�� ������. 
 * �ڿ�ã�� : Ctrl + Shift + R
 * ã��: Ctrl + H
 * java �ڵ带 �ڵ����� �������ִ� ����Ű�� �ִ�.
 * eclipse �ڵ�������� ����Ű�� Ctrl + Shift + F Ű �̴�.
 * �鿩���� ���.. �ڵ����� �������ش�.
 * Setter �޼ҵ� �ڵ�����Alt + Shift + s --> Generate Getters and Setters ����
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
		
		/*static method ������ �ν��Ͻ��� �޸𸮿� �������� �ʾ��� ���� �ֱ� ������
		 * employeeName = " Lee " �� ���� �ν��Ͻ� ���� ����̳� �Ҵ��� �Ұ����ϴ�.*/
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
