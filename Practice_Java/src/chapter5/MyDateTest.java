package chapter5;


public class MyDateTest {
		

		public static void main(String[] args) {
			
			System.out.println("�⵵�� �Է��Ͻÿ� : ");
			MyDate date1 = new MyDate(29, 2, 2000);
			System.out.println(date1.isValid());
			MyDate date2 = new MyDate(2, 100, 2006);
			System.out.println(date2.isValid());
		}
}
