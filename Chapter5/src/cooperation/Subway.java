package cooperation;

public class Subway {
	
	int subnumber;
	int passengernumber;
	int money;
	
	public Subway(int subnumber) {
		this.subnumber += subnumber;
	}
	public void take(int money) {
		this.money += money;
		passengernumber++;		
	}
	
	
	public void showInfo() {
		System.out.println(subnumber+ "�� �°��� ����" + passengernumber + "�̰� �����" + money + "�Դϴ�.");
	}

}