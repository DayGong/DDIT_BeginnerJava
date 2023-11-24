package ddit.chap07.sec05;

public class PlayerExample {
	public static void main(String[] args) {
		GomPlayer gplayer = new GomPlayer("mp3", 17);
		System.out.println(gplayer);
		gplayer.play(10);
	}
}
