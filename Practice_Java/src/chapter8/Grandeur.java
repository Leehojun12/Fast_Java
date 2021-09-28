package chapter8;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur 운행 시작");
		
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 운전 중");
		
	}

	@Override
	public void stop() {
		System.out.println("Grandeur 운행 멈춤");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Grandeur 시동 off");
		
	}


}
