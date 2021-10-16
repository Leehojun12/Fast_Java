package thread;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	public void run() {
		while(!flag) { // !flag = true ∞Ëº” µ∑¥Ÿ
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) { // setflag «ÿº≠ ∞Ëº” µµ¥¬ µ•∏Û¿Ã ∏ÿ√„
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {
		
		TerminateThread A = new TerminateThread("A");
		TerminateThread B = new TerminateThread("B");

		A.start();
		B.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A' || in == 'a') {
				A.setFlag(true);
			}else if(in =='B' || in == 'b') {
				B.setFlag(true);
			}else if (in == 'M' || in == 'm') {
				A.setFlag(true);
				B.setFlag(true);
				break;
			}
			else {
				System.out.println("again");
			}
		}
		System.out.println("Main end");
	}

}
