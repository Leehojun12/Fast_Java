package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student studentL = new Student("Lee",101);
		Student studentK = new Student("Kim", 102);
		Student studentC = new Student("Cho", 103);
		
			
		studentL.addBookList("�¹���1", "��ȣ��");
		studentL.addBookList("�¹���2", "��ȣ��");
		
		studentK.addBookList("����1", "123");
		studentK.addBookList("����2", "123");
		studentK.addBookList("����3", "123");
		
		studentC.addBookList("�ظ�����1", "234");
		studentC.addBookList("�ظ�����2", "234");
		studentC.addBookList("�ظ�����3", "234");
		studentC.addBookList("�ظ�����4", "234");
		studentC.addBookList("�ظ�����5", "234");
		studentC.addBookList("�ظ�����6", "234");
	
		studentL.showStudentInfo();
		studentK.showStudentInfo();
		studentC.showStudentInfo();
		

	}

}
