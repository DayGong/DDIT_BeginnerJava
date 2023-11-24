package ddit.chap08.sec01;

import java.io.IOException;

public class SchedulerExample {
	// throws(미루다): IOException 위험 감수, throw(던지다): 예외 강제 발생
	public static void main(String[] args) throws IOException {
//	public static void main(String[] args) {
		System.out.println("전화상담의 분배방식 선택");
		System.out.println("R: RoundRobin");
		System.out.println("L: LeastJob");
		System.out.println("P: PriorityAllocation");
		System.out.print("선택>> ");
		// 한글자만 쓸 수 있게 try-catch문 사용
		
		char c = ' ';
		
		try {
			c = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		char c = (char) System.in.read();
		
		Scheduler scheduler = null;

		if (c == 'R' || c == 'r') {
			scheduler = new RoundRobin();
		} else if (c == 'L' || c == 'l') {
			scheduler = new LeastJob();
		} else if (c == 'P' || c == 'p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("작업 선택 오류");
			System.exit(0);
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
