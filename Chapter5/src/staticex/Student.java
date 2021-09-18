package staticex;

public class Student {
	
	private static int serialNum = 1000; // private�� ����Ұ�� setter getter�� ���
	
	private int studentID;
	String studentName;
	String address;
	
	public Student(String name) { // �����ε� ������
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // �޼���(method) ,void�� ��ȯ�� �ȵȴ�(return X)
	
	public String getStudentName() {
		return studentName;
	}	
	public int  getStudentID() {
		return studentID;
	}

	public static int getSerialNum() { // static �޼��忡���� �ν��Ͻ� �޼��带 ���x
		
		//int i = 0;
		//studentName = "Lee"; // X
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
