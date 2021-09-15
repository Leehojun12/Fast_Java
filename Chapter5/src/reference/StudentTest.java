package reference;

public class StudentTest {
	public static void main(String[]args) {
		
		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(100, "Kim");
		
		studentLee.setKoreaSubject("국어", 80);
		studentLee.setMathSubject("수학", 55);
		studentKim.setKoreaSubject("국어", 30);
		studentKim.setMathSubject("수학", 55);
		
		studentLee.showStudentSocre();
		studentKim.showStudentSocre();
	}
}
