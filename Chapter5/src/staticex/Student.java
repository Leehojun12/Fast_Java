package staticex;

public class Student {
	
	private static int serialNum = 1000; // private를 사용할경우 setter getter를 사용
	
	private int studentID;
	String studentName;
	String address;
	
	public Student(String name) { // 오버로딩 생성자
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // 메서드(method) ,void는 반환이 안된다(return X)
	
	public String getStudentName() {
		return studentName;
	}	
	public int  getStudentID() {
		return studentID;
	}

	public static int getSerialNum() { // static 메서드에서는 인스턴스 메서드를 사용x
		
		//int i = 0;
		//studentName = "Lee"; // X
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
