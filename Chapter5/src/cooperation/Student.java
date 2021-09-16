package cooperation;

public class Student {
	
	String studentname;
	int age;
	int money;
	int a;
	
	public Student(String name, int money, int age) {
		this.studentname = name;
		this.money = money;
		this.age = age;
	}
	
	public void takeBus(Bus bus) {
		if(age < 7) {
			this.money -= 500;
			this.a += 500;
		}else if(age > 7 && age < 20) {
			this.money -= 700;
			this.a += 700;
		}else {
		this.money -= 1000;
		this.a += 1000;
		}
		bus.take(a);
		a= 0;
	}
	public void takeSubway(Subway sub) {
		if(age < 7) {
			this.money -= 600;
			this.a += 600;
		}else if(age > 7 && age < 20) {
			this.money -= 800;
			this.a += 800;
		}else {
		this.money -= 1100;
		this.a +=1100;
		}
		sub.take(a);
		a=0;
	}
	public void showInfo() {
		System.out.println(studentname +"은 총액이" + money +"입니다.");
	}

}
