package constructor;

public class Student {
	
	int studentID;
	String studentName;
	String address;
	
	public Student(String name) { // �����ε� ������
		studentName = name;
	}
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // �޼���(method) ,void�� ��ȯ�� �ȵȴ�(return X)
	
	public String getStudentName() {
		return studentName;
	}	
}