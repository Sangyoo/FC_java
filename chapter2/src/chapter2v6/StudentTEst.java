package chapter2v6;

/**
 * @packageName	: chapter2v6
 * @fileName	: StudentTEst.java
 * @author 		: Sangyu Lee
 * @date		: 2022.06.18
 * @description	: alt+shift+j
 * ================================================================================================
 * DATE			Author			Note
 * ================================================================================================
 * 2022.06.18	Sangyu Lee		置段 持失
 */
public class StudentTEst {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(12345, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}
}

