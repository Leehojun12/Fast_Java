package cooperation;

public class Subway {
	
	int subnumber;
	int passengernumber;
	int money;
	int a;
	
	public Subway(int subnumber) {
		this.subnumber += subnumber;
	}
	public void take(int money) {
		this.a += money;
		passengernumber++;		
	}
	
	
	public void showInfo() {
		System.out.println(subnumber+ "�� �°��� ����" + passengernumber + "�̰� �����" + a + "�Դϴ�.");
	}

}