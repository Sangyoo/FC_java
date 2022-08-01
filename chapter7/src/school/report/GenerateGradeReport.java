package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n ";
	public static final String LINE = "-------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();  
	
	public String getReport(){
		ArrayList<Subject> sbList = school.getSubjectList();
		
		for(Subject sb: sbList) {
			makeHeader(sb);
			makeBody(sb);
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject){
		buffer.append(LINE);
		buffer.append(subject.getSbName());
		buffer.append(" " + TITLE);
		buffer.append(HEADER);
		buffer.append(LINE);
	} 
	
	public void makeBody(Subject subject){
		
			ArrayList<Student> tempSList = subject.getStudentList();
			for(Student st: tempSList) {
				buffer.append(st.getStName());
				buffer.append("\t");
				buffer.append(st.getStId());
				buffer.append("\t");
				buffer.append(st.getMajor().getSbName());
				buffer.append(" ");
				getScoreGrade(st, subject);
			}
	}
	
	public void getScoreGrade(Student student, Subject subject){
		GradeEvaluation[] major = {new BasicEvaluation(), new MajorEvaluation()};
		ArrayList<Score> scList = student.getScoreList();// 인수로 주어진 학생의 scoreList
		for(int i = 0; i<scList.size() ; i++ ) {
			//학생의 scoreList에서 출력하고 싶은과목찾기
			if(subject.getSbName() == scList.get(i).getSubject().getSbName()) {//과목을 찾았다
				String grade;
				//어떤 기준으로 등급을 매길 것인가
				//주요과목이라면
				if(student.getMajor().getSbName() == subject.getSbName()) {
					grade = major[1].getGrade(scList.get(i).getSbScore());
				}
				//주요 과목이 아니라면
				else {
					grade = major[0].getGrade(scList.get(i).getSbScore());
				}
				buffer.append(" | ");
				buffer.append(scList.get(i).getSbScore());
				buffer.append(" : ");
				buffer.append(grade);
				buffer.append(" | ");
				buffer.append("\n");
			}
		}
	}
	
	public void makeFooter(){
		buffer.append("\r\n");
	}
}