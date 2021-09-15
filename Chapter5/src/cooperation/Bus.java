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
		System.out.println(busnumber + "의 승객의 수는" + passengernumber + "명 이고 요금은" + money + "입니다.");
	}

}
