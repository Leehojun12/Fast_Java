package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("순서대로 상당 전화를 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분");
	}

}
