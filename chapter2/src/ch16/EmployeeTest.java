package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("�̼���");
		
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("������");
		
		System.out.println(employee1.getEmployeeName()+ " ���� ����� " + employee1.getEmployeeId() + "�Դϴ�.");
		
	}

}
