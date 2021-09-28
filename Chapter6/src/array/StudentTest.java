package array;

public class StudentTest {

	public static void main(String[] args) {
		Student studentL = new Student(100, "Lee");
		Student studentK = new Student(102,"Kim");
		
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 90);
		
		studentK.addSubject("국어", 11);
		studentK.addSubject("수학", 41);
		studentK.addSubject("영어", 82);
		
		studentL.showStudentInfo();
		System.out.println("=========================");
		studentK.showStudentInfo();
		

	}

}
