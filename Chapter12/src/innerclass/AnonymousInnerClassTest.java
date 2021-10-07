package innerclass; // 익명 이너 클래스


class Outer1{
	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(final int i) {
		final int num = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				
				//	num += 19; // 상수화를 시켜야된다. 지역변수 내에선 사용할수 없다.
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println("test");
			}
		};
	}
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
			
		}
	};
}
public class AnonymousInnerClassTest {


	public static void main(String[] args) {
		
		Outer1 outer = new Outer1();
		Runnable runnable = outer.getRunnable(50);
		
		outer.runner.run();
		runnable.run();
		

	}

}
