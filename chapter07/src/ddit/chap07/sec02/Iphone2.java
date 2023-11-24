package ddit.chap07.sec02;

public class Iphone2 extends Iphone1 {
		
	Iphone2(String owner, String phoneNum) {
		super(owner, phoneNum);
	}
	
	public void fingerPrintRecog() {
		System.out.println("지문 인식 가능");
	}
}
