package thread;

class MyThread1 implements Runnable{
	public void run() {
		int i;
		for(i=0; i<=200;i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.print(e);
			}
		}
	}
}

public class ThreadTest2{
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Thread t = Thread.currentThread(); // 지금 정보를 호출
		System.out.println(t);
		
		System.out.println("end");
	}

}
