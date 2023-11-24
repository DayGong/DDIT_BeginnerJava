package ddit.chap06.sec01;

public class ClassExample01 {
	public static void main(String[] args) {
		Temp t1 = new Temp(30);
		t1.printAge();
	}
}

class Temp {
	int age = 17;

	{
		System.out.println("직접 초기화 age = " + age);
		age = 20;
		System.out.println("초기화 블록 age = " + age);
	}

	Temp(int age) {
		this.age = age;
		System.out.println("생성자 메소드 age = " + age);
	}

	void printAge() {
		System.out.println("나이 = " + age);
	}
}