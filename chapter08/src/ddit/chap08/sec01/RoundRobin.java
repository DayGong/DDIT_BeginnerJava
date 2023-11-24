package ddit.chap08.sec01;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기열에서 차례대로 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("차려대로 다음 상담원에게 상담 전화를 분배");
	}

}
