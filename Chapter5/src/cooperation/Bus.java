package cooperation;

public class Bus {
	
	int busnumber;
	int passengernumber;
	int money;
	int a;
	
	public Bus(int busnumber) {
		this.busnumber += busnumber;
	}
	public void take(int money) {
		this.a += money;
		passengernumber++;		
	}
	
	public void showInfo() {
		System.out.println(busnumber + "���� �°��� ����" + passengernumber + "�� �̰� �����" + a + "�Դϴ�.");
	}

}
