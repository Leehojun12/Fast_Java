package classpart;

public class StudentTest {
	public static void main(String[]args) {
		
		Student studentLee = new Student(); 
		studentLee.studentName = "��ȣ��";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentName = "��ȣ��";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
