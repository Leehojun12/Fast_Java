package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(String studentName, int studentNum) {
		this.studentName = studentName;
		this.studentNum = this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
			}
			return false;
	}
	

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student("이호준", 100);
		Student Lee2 = Lee;
		Student Shin = new Student("이호준", 100);
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // hash 코드 
		
		System.out.println(System.identityHashCode(i1)); // 메모리 값
		System.out.println(System.identityHashCode(i2));
	}
}
