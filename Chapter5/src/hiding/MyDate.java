package hiding;

public class MyDate {
	
	private int day; 	// public�� ���ִ� ���� package�� �޶� ���ش� 
	private int month;	// �ܺ� class������ ��밡��
	private int year;
	
	//getter , setter
	private boolean isValid;
	
	public void setDay(int day) {
		this.day = day; // �� day�� ���� ���� �� day�� public ����
	}
	public int getDay() {
		return day; // ���� ��������
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 1 && month < 12) {
			isValid = true;
		}
		this.month = month; // this�� ������ �� ���� month�� �ȴ�.
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid == true) {
			System.out.println(year + "��" + month + "��" + day + "��" + "�Դϴ�");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
	}

}
