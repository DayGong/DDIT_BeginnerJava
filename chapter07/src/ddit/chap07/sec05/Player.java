package ddit.chap07.sec05;

public abstract class Player {
	String mediaKind;
	int runningTime;
	
	Player(String mediaKind, int runningTime) {
		this.mediaKind = mediaKind;
		this.runningTime = runningTime;
	}
	
	// 추상 메소드
	abstract void play(int pos);
	abstract void stop();
	
	@Override
	public String toString() {
		return "재생매체: " + mediaKind + "\n총 재생시간: "+runningTime;
	}
}
