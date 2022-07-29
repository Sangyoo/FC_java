package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentNumber;
	String studentName;
	
	ArrayList<Subject> sbInfo = new ArrayList<>();
	
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}
	
	public void addSubject(String subject, int score) {
		Subject sb = new Subject(subject, score);
		sbInfo.add(sb);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		for(Subject a : this.sbInfo) {
			System.out.println("학생 " + this.studentName + "의 " + a.subName + " 과목 성적은" + a.score + "입니다.");
			sum += a.score;
		}
		System.out.println("학생 " + this.studentName + "의 총점은 " + sum + "입니다." );
	}
}
