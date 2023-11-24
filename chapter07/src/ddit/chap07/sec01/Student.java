package ddit.chap07.sec01;

public class Student extends Person {
	String schoolName;

	Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("학교명: " + schoolName);
	}
}
