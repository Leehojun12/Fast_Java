package constructor;

public class StudentTest {
	public static void main(String[]args) {
		
		Student studentLee = new Student("이호준"); // default constructor
		//studentLee.studentName = "이호준";
		//studentLee.address = "수원";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "김호준");
		
		//studentKim.studentName = "김호준";
		//studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
