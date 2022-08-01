package ch24;

import java.util.ArrayList;

public class Student {
	
	private int stId;
	private String stName;
	private String major;
	
	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int stId, String stName, String major) {
		this.stId = stId;
		this.stName = stName;
		this.major = major;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	
}
