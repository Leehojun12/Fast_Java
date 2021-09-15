package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.SubjectName = name;
		korea.Score = score;
	}
	public void setMathSubject(String name, int score) {
		math.SubjectName = name;
		math.Score = score;
	}
	
	public void showStudentSocre() {
		int total = korea.Score + math.Score;
		System.out.println(studentName + "학생의 총점은 : "+ total + "입니다");
	}


}
