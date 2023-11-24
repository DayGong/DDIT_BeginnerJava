package ddit.chap07.sec04;

public class Female extends Human {
	int age;
	String job;
	String name = "향단이";

	Female(String name, int age, String job) {
		super(name);
		this.age = age;
		this.job = job;
	}
	
	@Override
	public void printInfo() {
		System.out.println("나는 여성입니다.");
		System.out.println("이름은 "+name+"이고 나이는 "+age+"살이며 직업은 "+job+"입니다.");
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}
