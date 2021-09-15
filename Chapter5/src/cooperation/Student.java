package cooperation;

public class Student {
	
	String studentname;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.studentname = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway sub) {
		sub.take(1200);
		this.money -= 1200;
	}
	public void showInfo() {
		System.out.println(studentname +"은 총액이" + money +"입니다.");
	}

}
