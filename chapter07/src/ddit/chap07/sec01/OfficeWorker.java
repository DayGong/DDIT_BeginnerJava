package ddit.chap07.sec01;

public class OfficeWorker extends Person{
	String workplace;
	String position;

	OfficeWorker(String name, int age, String workplace, String position) {
		super(name, age);
		this.workplace = workplace;
		this.position = position;
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("직장명: " + workplace);
		System.out.println("직위: " + position);
	}
}
