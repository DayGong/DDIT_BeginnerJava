package ddit.chap07.sec02;

public class Phone {
	protected String owner;
	protected String phoneNum;
	
	Phone(String owner, String phoneNum) {
		this.owner = owner;
		this.phoneNum = phoneNum;
	}
	
	public void voicePhone() {
		System.out.println("음성통화기능");
	}
}
