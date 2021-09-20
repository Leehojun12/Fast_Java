package hiding;

public class MyDate {
	
	private int day; 	// public�� ���ִ� ���� package�� �޶� ���ش� 
	private int month;	// �ܺ� class������ ��밡��
	private int year;
	
	//getter , setter
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			isValid = false;
		}
		this.day = day; // �� day�� ���� ���� �� day�� public ����
	}
	public int getDay() {
		return day; // ���� ��������
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		this.month = month; // this�� ������ �� ���� month�� �ȴ�.
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String isValid() {
		if(isValid) {
			return year + "��" + month + "��" + day + "��" + "�Դϴ�";
		}
		else {
			return "��ȿ���� ���� ��¥ �Դϴ�.";
		}	
	}

}
