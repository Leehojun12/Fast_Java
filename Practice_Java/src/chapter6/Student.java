package chapter6;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName, int studentID) {
		this.studentID = studentID;
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	public void addBookList(String title, String author) {
		Book book = new Book(title, author);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for(Book book : bookList) {
		System.out.print(book.getTitle() + " ");
		}
		System.out.println("입니다.");
	}

}
