package chapter5;

public class Taxi {
	int taxinumber;
	long distanse;
	int money;
	int a;
		
	public Taxi(int taxinumber, long distanse) {
		this.taxinumber = taxinumber;
		this.distanse = distanse;
	}
	
	public void take(int money) {
		this.money = money;
		
	}
	public void showInfo() {
		System.out.println("taxi��ȣ"+ taxinumber +"��" + distanse + "m��ŭ����" + money +"�� �޾Ҵ�.");
	}
}
