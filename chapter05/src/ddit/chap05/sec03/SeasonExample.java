package ddit.chap05.sec03;

public class SeasonExample {

	public static void main(String[] args) {
//		Person p1 = new Person("홍길동", Season.WINTER);
//		System.out.println("고객명: " + p1.name);
//		System.out.println("좋아하는 계절: " + p1.favorite_season);

//		System.out.println(p1);
		myMethod02();
	}

	public static void myMethod01() {
		Season s1 = Season.SUMMER;
		System.out.println("계절: " + s1);
		System.out.println("계절: " + Season.WINTER);
	}

	public static void myMethod02() {
		// name() 메서드
//		Season s1 = Season.SPRING;
//		String mf_season = s1.name(); // 객체가 가지고있는 이름을 문자열로 반환
//		System.out.println("내가 좋아하는 계절: " + mf_season);

		// ordinal() 메서드
//		s1 = Season.FALL;
//		int idx = s1.ordinal();
//		System.out.println("index: " + idx);

		// valueOf() 메서드: 반환타입은 열거타입, 매개변수는 문자열
//		Season res = Season.valueOf("SPRING");
//		System.out.println("res = " + res);

		// values() 메서드: 열거 타입의 배열로 열거상수를 반환
//		Season[] season = Season.values();
		// 기능이 강화되어진 for문: 배열과 Collection Framework에서만 사용(객체가 있는 경우에만 사용 가능)
		// 변수타입 변수명 : 배열
//		for (Season s : season) { // season의 첫번째 요소부터 마지막 요소까지 꺼내줌
//			System.out.println((s.ordinal() + 1) + "계절: " + s);
//		}
	}

}

class Person {
	String name;
	Season favorite_season;

	Person(String name, Season favorite_season) {
		this.name = name;
		this.favorite_season = favorite_season;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", favorite_season=" + favorite_season + "]";
	}
}