package array;

public class StudentTest {

	public static void main(String[] args) {
		Student studentL = new Student(100, "Lee");
		Student studentK = new Student(102,"Kim");
		
		studentL.addSubject("����", 100);
		studentL.addSubject("����", 90);
		
		studentK.addSubject("����", 11);
		studentK.addSubject("����", 41);
		studentK.addSubject("����", 82);
		
		studentL.showStudentInfo();
		System.out.println("=========================");
		studentK.showStudentInfo();
		

	}

}
