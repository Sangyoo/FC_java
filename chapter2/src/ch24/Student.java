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
			System.out.println("�л� " + this.studentName + "�� " + a.subName + " ���� ������" + a.score + "�Դϴ�.");
			sum += a.score;
		}
		System.out.println("�л� " + this.studentName + "�� ������ " + sum + "�Դϴ�." );
	}
}
