package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1","��ȣ��");
		library[1] = new Book("�¹���2","��ȣ��");
		library[2] = new Book("�¹���3","��ȣ��");
		library[3] = new Book("�¹���4","��ȣ��");
		library[4] = new Book("�¹���5","��ȣ��");
		
		copyLibrary[0] =new Book();
		copyLibrary[1] =new Book();
		copyLibrary[2] =new Book();
		copyLibrary[3] =new Book();
		copyLibrary[4] =new Book();
		
		for (int i = 0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for( Book book : library) {
			book.showBookInfo();
		}
		System.out.println("=============");
		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
			 
		}
	}