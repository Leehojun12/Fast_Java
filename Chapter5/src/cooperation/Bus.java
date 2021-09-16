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
		System.out.println(busnumber + "번의 승객의 수는" + passengernumber + "명 이고 요금은" + a + "입니다.");
	}

}
