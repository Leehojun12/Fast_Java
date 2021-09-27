package template;

public class CarTest {

	public static void main(String[] args) {
		
		AICar aicar = new AICar();
		aicar.run();
		System.out.println("=========================");
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
