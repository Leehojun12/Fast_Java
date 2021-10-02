package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("고객 등급이 높은 고객의 call을 머너 가져옴.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분.");		
	}

}
