package chapter10;

class MyDate{
		int day;
		int month;
		int year;
	
		public MyDate(int day, int month, int year) {
			
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public int hashCode() {
			return day;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof MyDate) {
				MyDate date = (MyDate)obj;
				if(this.day == date.day && this.month == date.month && this.year == date.year)
					return true;
				else return false;
			}
			return false;			
		}
		
		
}
		public class MyDateTest {
			
		public static void main(String[] args) {
			
		MyDate date = new MyDate(10, 10, 2021);
		MyDate date1 = new MyDate(10, 10, 2021);
		
		System.out.println(date.equals(date1));
		System.out.println(date.hashCode());
		System.out.println(date1.hashCode());
		
		
		}
	}
