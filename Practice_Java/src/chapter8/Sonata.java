package chapter8;


public class Sonata extends Car{
		
	@Override
	public void start() {
		System.out.println("Sonata ���� ����");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata ���� ��");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata ���� ����");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata �õ� off");
		
	}

}
