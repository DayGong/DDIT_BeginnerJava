package ddit.chap06.sec03;

public class Person {
	int pid;
	String name;
	String gender;
	int age;

	// 기본 생성자
	Person() {
		this(1001, "홍길동", "남자", 25);
	}

	Person(int pid) {
//		this.pid = pid;
		this(pid, "홍길동", "남자", 25);
	}

	Person(int pid, String name) {
//		this.pid = pid;
//		this.name = name;
		this(pid, name, "남자", 25);
	}

	Person(int pid, String name, String gender) {
//		this.pid = pid;
//		this.name = name;
//		this.gender = gender;
		this(pid, name, gender, 25);
	}

	Person(int pid, String name, String gender, int age) {
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "----------------------------\n번호: "+pid+"\n이름: "+name+"\n성별: "+gender+"\n나이: "+age;
	}
	
	public void printInfo() {
//		System.out.println("번호: "+pid);
//		System.out.println("이름: "+name);
//		System.out.println("성별: "+gender);
//		System.out.println("나이: "+age);
	}
}
