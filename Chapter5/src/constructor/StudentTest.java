package constructor;

public class StudentTest {
	public static void main(String[]args) {
		
		Student studentLee = new Student("��ȣ��"); // default constructor
		//studentLee.studentName = "��ȣ��";
		//studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "��ȣ��");
		
		//studentKim.studentName = "��ȣ��";
		//studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
