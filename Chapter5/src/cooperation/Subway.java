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
		System.out.println(subnumber+ "의 승객의 수는" + passengernumber + "이고 요금은" + a + "입니다.");
	}

}