package ddit.chap07.sec04;

import java.util.ArrayList;

public class DownCastingEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("홍길동", 25, "남자"));
		list.add(1234);
		Person p1 = (Person)(list.get(0));
		p1.showPerson();

//		Object obj = (Person) list.get(0); // list는 부모인 Object 클래스기 때문에 자식 클래스(Person)에 값 저장 불가
//		if (obj instanceof Person) {
//			p1 = (Person) obj; // cast 연산자로 다운캐스트
//			p1.showPerson();
//		}

	}
}

class Person {
	String name;
	int age;
	String gender;

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void showPerson() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
	}
}