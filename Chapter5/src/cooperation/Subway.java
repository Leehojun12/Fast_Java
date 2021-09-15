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
		System.out.println(subnumber+ "의 승객의 수는" + passengernumber + "이고 요금은" + money + "입니다.");
	}

}