package ddit.chap07.sec04;

public class Customer {
	int sum; // 총 구매액
	int mileage;
	String item = ""; // 구매 목록

	// buy메서드를 하나만 쓸 수 있도록 업캐스트
	void buy(Goods g) {
		sum += g.price;
		mileage += g.mileage;
		item = g.toString() + ", " + item;
	}

	// 계산(영수증 출력)
	void summary() {
		System.out.println("구매목록: " + item);
		System.out.println("구매금액: " + sum);
		System.out.println("마일리지: " + mileage);
	}
}