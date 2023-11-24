package ddit.chap07.sec02;

public class PhoneExample {
	public static void main(String[] args) {
		Iphone1 ip1 = new Iphone1("정몽주", "010-1234-5678");
		System.out.println("소유자: "+ip1.owner);
		System.out.println("핸드폰 번호: "+ip1.phoneNum);
		ip1.voicePhone();
		ip1.playMusic();
		
		Iphone2 ip2 = new Iphone2("강감찬", "010-9876-1234");
		System.out.println("소유자: "+ip2.owner);
		System.out.println("핸드폰 번호: "+ip2.phoneNum);
		ip2.voicePhone();
		ip2.playMusic();
		ip2.fingerPrintRecog();
	}
}