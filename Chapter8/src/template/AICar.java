package template;

public class AICar extends Car{


	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ��� �ڵ� ���� ��ȯ");
		
	}

	@Override
	public void stop() {
		System.out.println(" �ڵ� ����");
		
	}
	@Override
	public void washCar() {
		System.out.println("�ڵ�����");
		super.washCar();
	}

}
