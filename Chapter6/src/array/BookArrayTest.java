package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���1","��ȣ��");
		library[1] = new Book("�¹���2","��ȣ��");
		library[2] = new Book("�¹���3","��ȣ��");
		library[3] = new Book("�¹���4","��ȣ��");
		library[4] = new Book("�¹���5","��ȣ��");
		
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
