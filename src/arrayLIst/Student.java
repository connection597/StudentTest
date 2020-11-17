package arrayLIst; //Student클래스 구현하기

import java.util.ArrayList;

public class Student {
	int studentID;  //Student클래스의 멤버변수
	String studentName;
	ArrayList<Subject> subjectList; 
	
	public Student(int studentID, String studnetName) { //생성자
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total =0;
		for(Subject s : subjectList) {
			total += s.getScorePoint(); //총점 더하기
			System.out.println("학생"+studentName+"의"+s.getName()
			+"과목의 성적은"+s.getScorePoint+"입니다");
		}
	System.out.println("학생"+studentName+"의 종점은"+total+"입니다");
	}

}
