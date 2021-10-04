package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable { 
		// TODO Auto-generated method stub
		super.finalize(); 
	}
	
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Book book = new Book("토지", "이호준");
		System.out.println(book);
		
		Book book2 = (Book)book.clone();
		System.out.println(book2);
	}

}
