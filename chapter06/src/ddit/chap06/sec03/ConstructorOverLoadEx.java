package ddit.chap06.sec03;

public class ConstructorOverLoadEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1); //p1만 쓰면 toString()이 생략 된 것
		
		Person p2 = new Person(2304);
		System.out.println(p2.toString());
		
		Person p3 = new Person(9999, "박지원");
		System.out.println(p3.toString());
		
		Person p4 = new Person(1986, "허난설헌", "여자");
		System.out.println(p4.toString());
	}
}
