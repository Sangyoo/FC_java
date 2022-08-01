package ch24;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private int sbId;
	private String sbName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String sbName, int sbId) {
		this.sbId = sbId;
		this.sbName = sbName;
		this.gradeType = Define.AB_TYPE;
	}
}
