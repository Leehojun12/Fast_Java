package classpart;

public class Student {
	
	int studentID;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // �޼���(method) ,void�� ��ȯ�� �ȵȴ�(return X)
	
	public String getStudentName() {
		return studentName;
	}	
}
