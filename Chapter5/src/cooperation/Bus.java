package cooperation;

public class Bus {
	
	int busnumber;
	int passengernumber;
	int money;
	
	public Bus(int busnumber) {
		this.busnumber += busnumber;
	}
	public void take(int money) {
		this.money += money;
		passengernumber++;		
	}
	
	public void showInfo() {
		System.out.println(busnumber + "�� �°��� ����" + passengernumber + "�� �̰� �����" + money + "�Դϴ�.");
	}

}
