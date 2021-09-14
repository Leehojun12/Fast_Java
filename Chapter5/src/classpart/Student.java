package classpart;

public class Student {
	
	int studentID;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // 메서드(method) ,void는 반환이 안된다(return X)
	
	public String getStudentName() {
		return studentName;
	}	
}
