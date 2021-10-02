package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("순서대로 상당 전화를 가져옴");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 상담대기가 가장 적은 상담원에게 할당");
		
	}

}
