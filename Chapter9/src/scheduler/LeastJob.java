package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("������� ��� ��ȭ�� ������");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ����Ⱑ ���� ���� �������� �Ҵ�");
		
	}

}
