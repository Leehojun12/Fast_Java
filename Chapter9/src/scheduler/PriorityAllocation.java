package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("�� ����� ���� ���� call�� �ӳ� ������.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ���.");		
	}

}
