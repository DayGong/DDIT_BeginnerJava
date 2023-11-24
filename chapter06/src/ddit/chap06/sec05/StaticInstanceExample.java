package ddit.chap06.sec05;

import java.util.Scanner;

//상품 이름을 키보드로 입력 받는 메서드 작성
public class StaticInstanceExample {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Goods g1 = new Goods("청소기");
		g1.printInfo();
		
		Goods g2 = new Goods(inputProdName());
		g2.printInfo();
		
		Goods g3 = new Goods(inputProdName());
		g3.printInfo();
	}
	
	public static String inputProdName() {
		System.out.print("상품명: ");
		String pn = sc.nextLine();
		
		return pn;
	}
}
