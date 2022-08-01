package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private int sbId;
	private String sbName;
	private int gradeType;
	
	public int getSbId() {
		return sbId;
	}

	public void setSbId(int sbId) {
		this.sbId = sbId;
	}

	public String getSbName() {
		return sbName;
	}

	public void setSbName(String sbName) {
		this.sbName = sbName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String sbName, int sbId) {
		this.sbId = sbId;
		this.sbName = sbName;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
}
