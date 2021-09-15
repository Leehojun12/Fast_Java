package classpart;

public class Student {
	
	int studentID;
	String studentName;
	String address;
	
	public Student(String name) { // 오버로딩 생성자
		studentName = name;
	}
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // 메서드(method) ,void는 반환이 안된다(return X)
	
	public String getStudentName() {
		return studentName;
	}	
}
