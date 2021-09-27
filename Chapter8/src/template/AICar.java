package template;

public class AICar extends Car{


	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차 자동 방향 전환");
		
	}

	@Override
	public void stop() {
		System.out.println(" 자동 멈춤");
		
	}
	@Override
	public void washCar() {
		System.out.println("자동세차");
		super.washCar();
	}

}
