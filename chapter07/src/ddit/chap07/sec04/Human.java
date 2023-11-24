package ddit.chap07.sec04;

public class Human {
	String name;

	Human(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("이름이 "+name+"인 사람입니다.");
	}
}
