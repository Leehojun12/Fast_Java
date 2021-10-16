package thread;

public class InterruptTest extends Thread{

	public void run() {
		
		int i;
		for(i=0; i<100; i++) {
			System.out.println(i);
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake!!!");
		}
	}
	public static void main(String[] args) {
 
		InterruptTest t = new InterruptTest();
		t.start();
		t.interrupt(); // Exception���� ������ ���̳�(��ŷ)
		
		System.out.println("end");
		
	}

}
