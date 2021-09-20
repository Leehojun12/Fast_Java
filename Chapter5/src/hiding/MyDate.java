package hiding;

public class MyDate {
	
	private int day; 	// public을 해주는 이유 package가 달라 해준다 
	private int month;	// 외부 class에서도 사용가능
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
		this.day = day; // 앞 day는 위에 변수 뒤 day는 public 변수
	}
	public int getDay() {
		return day; // 값을 가져간다
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		this.month = month; // this가 없으면 다 같은 month가 된다.
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String isValid() {
		if(isValid) {
			return year + "년" + month + "월" + day + "일" + "입니다";
		}
		else {
			return "유효하지 않은 날짜 입니다.";
		}	
	}

}
