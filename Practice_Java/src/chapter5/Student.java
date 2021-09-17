package chapter5;

public class Student {
	
	String studentName;
	int money;
	long distanse;
	int wake;
	int a;
	
	public Student(String name, int wake, int money, long distanse) {
		  this.studentName = name;
		  this.money = money;
		  this.wake = wake;
		  this.distanse = distanse;
	}
	public  void takeTaxi(Taxi taxi) {
		if(wake > 8) {
			if(distanse < 500) {
				this.money -= 2000;
				this.a += 2000;
			}else if(distanse>600 && distanse < 1000) {
				this.money -= 8000;
				this.a += 8000;
			}else {
				this.money -= 10000;
				this.a += 10000;
			}
		}else {
			if(distanse < 500) {
				this.money -= 2000;
				this.a += 2000;
			}else if(distanse>600 && distanse < 1000) {
				this.money -= 8000;
				this.a += 8000;
			}else {
				this.money -= 10000;
				this.a += 10000;
			}
		}
		taxi.take(a);
	}
	public void showInfo() {
		if(wake > 8) {
			System.out.println(studentName + "��" + wake + "�� �ʰ� �Ͼ "+ distanse + 
				"m��ŭ ���� ���� ���� ������ "+ money +"���� ���Ҵ�.");
		}else {
			System.out.println(studentName + "��" + wake + "�� ���� �Ͼ " + distanse +
					"m��ŭ ���� ��Ȱ�� ���� ���� ���� " + money + "���� ���Ҵ�. ");
		}
	}
}
