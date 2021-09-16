package cooperation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentL = new Student("Lee", 5000, 4);
		Student studentK = new Student("Kim", 10000, 15);
		
		Bus bus100= new Bus(100);
		Bus bus500= new Bus(500);
		Bus bus600= new Bus(600);
		
		Subway subGreen = new Subway(2);
		Subway subBlue = new Subway(1);
		
		studentL.takeBus(bus600);
		studentL.takeBus(bus100);
		studentK.takeSubway(subBlue);
		
		studentL.showInfo();
		studentK.showInfo();		
		
		bus100.showInfo();
		bus600.showInfo();
		bus500.showInfo();
		
		subGreen.showInfo();
		subBlue.showInfo();
		
		
		

	}

}
