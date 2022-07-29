package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
		
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김유신");
		
		System.out.println(employee1.getEmployeeName()+ " 님의 사번은 " + employee1.getEmployeeId() + "입니다.");
		
	}

}
