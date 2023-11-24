package ddit.chap07.sec02;

public class Iphone1 extends Phone {
	
	Iphone1(String owner, String phoneNum) {
		super(owner, phoneNum);
	}
	
	public void playMusic() {
		System.out.println("음악을 재생");
	}
}
