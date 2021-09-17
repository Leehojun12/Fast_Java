package chapter5;

public class StudentTest {
	public static void main(String []args) {
	
	Student studentL = new Student("Lee", 7, 15000, 800);
	Student studentP = new Student("Park", 10, 20000, 1100);
	
	Taxi taxi2021 = new Taxi(2021, 800);
	Taxi taxi2022 = new Taxi(2020, 1100);
	
	studentL.takeTaxi(taxi2021);
	studentP.takeTaxi(taxi2022);
	
	studentL.showInfo();
	studentP.showInfo();
	
	taxi2021.showInfo();
	taxi2022.showInfo();
	}
}
