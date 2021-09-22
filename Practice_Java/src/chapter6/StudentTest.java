package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student studentL = new Student("Lee",101);
		Student studentK = new Student("Kim", 102);
		Student studentC = new Student("Cho", 103);
		
			
		studentL.addBookList("태백산맥1", "이호준");
		studentL.addBookList("태백산맥2", "이호준");
		
		studentK.addBookList("토지1", "123");
		studentK.addBookList("토지2", "123");
		studentK.addBookList("토지3", "123");
		
		studentC.addBookList("해리포터1", "234");
		studentC.addBookList("해리포터2", "234");
		studentC.addBookList("해리포터3", "234");
		studentC.addBookList("해리포터4", "234");
		studentC.addBookList("해리포터5", "234");
		studentC.addBookList("해리포터6", "234");
	
		studentL.showStudentInfo();
		studentK.showStudentInfo();
		studentC.showStudentInfo();
		

	}

}
