package ddit.chap07.sec04;

public class HumanExample {
	public static void main(String[] args) {
		Human h1 = new Female("이쁜이", 25, "SW개발자"); //업캐스트
		System.out.println("이름: "+h1.name); 
		//Human에 있는 Name은 '이쁜이' Female에 있는 Name은 '향단이'
		//타입이 Human이면 변수도 Human
		
//		h1.setJob("전업주부"); // 부모클래스에 없는 메서드는 호출 불가
		h1.printInfo(); //부모클래스에 있는 메서드는 자식클래스가 재정의해서 사용 가능 
	}
}
