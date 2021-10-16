package thread;

class Bank{  
	private int money = 10000;
	
	public void saveMoney(int save) { //synchronized lock�� �ɸ���
		//synchronized (this) {
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			setMoney(m + save);
		//}
	}
	
	public synchronized void minusMoney(int minus) {	
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		setMoney(m - minus);
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}	
}
class Park extends Thread{
	
	public void run() {
		synchronized (SynTest.myBank) {
			System.out.println("start save");
			SynTest.myBank.saveMoney(3000);
			System.out.println("save money : " + SynTest.myBank.getMoney());
		}
	}
}
class ParkWife extends Thread{

	public void run() {
		synchronized (SynTest.myBank) {			
			System.out.println("start minus");
			SynTest.myBank.minusMoney(1000);
			System.out.println("minus money : " + SynTest.myBank.getMoney());
		}
	}
}
public class SynTest {
	
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start(); // Park ����
		
		Thread.sleep(200); // 0.2�� �ڿ�
		
		ParkWife pw = new ParkWife();  //wife ����
		pw.start();

	}

}
