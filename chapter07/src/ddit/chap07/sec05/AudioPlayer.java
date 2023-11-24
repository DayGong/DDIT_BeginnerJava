package ddit.chap07.sec05;

public abstract class AudioPlayer extends Player {

	AudioPlayer(String mediaKind, int runningTime) {
		super(mediaKind, runningTime);
	}

	@Override
	void play(int pos) {
		if (pos >= runningTime) {
			System.out.println("재생이 종료되었습니다.");
		} else {
			System.out.println(pos + "분 위치부터 재생합니다.");
		}
	}

}

class GomPlayer extends AudioPlayer {

	GomPlayer(String mediaKind, int runningTime) {
		super(mediaKind, runningTime);
	}

	@Override
	void stop() {
	}

}