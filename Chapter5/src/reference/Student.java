package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject	math;
	
	public Student(int id, String name){ //생성자를 통해 초기화
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 :" + total + "입니다");
	}
}
