package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥1","이호준");
		library[1] = new Book("태백산맥2","이호준");
		library[2] = new Book("태백산맥3","이호준");
		library[3] = new Book("태백산맥4","이호준");
		library[4] = new Book("태백산맥5","이호준");
		
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
