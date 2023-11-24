package ddit.chap06.sec05;

public class Goods {
	static int prodID = 1000;
	String prodName;

	Goods(String prodName) {
		prodID++;
		this.prodName = prodName;
	}

	public void printInfo() {
		System.out.println("상품코드: " + prodID);
		System.out.println("상품명: " + prodName);
		System.out.println("-------------------------------");
	}
}
