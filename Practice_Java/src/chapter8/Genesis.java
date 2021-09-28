package chapter8;

public class Genesis extends Car{
	@Override
	public void start() {
		System.out.println("Genesis 운행 시작");
		
	}

	@Override
	public void drive() {
		System.out.println("Genesis 운전 중");
		
	}

	@Override
	public void stop() {
		System.out.println("Genesis 운행 멈춤");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Genesis s시동 off");
		
	}


}
