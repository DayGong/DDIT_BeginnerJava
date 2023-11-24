package ddit.chap13.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
//		System.out.println("저장된 자료 수: " + list1.size());
//		list1.add("홍길동");
//		list1.add(100);

//		for (int i = 1; i <= 16; i++) {
//			list1.add(i * 1000);
//		}
//		System.out.println(list1);

//		System.out.println(list1.contains("홍길동"));

		list1.add(new Product("볼펜", 1500));
		list1.add(new Product("매직키보드", 10000));
//		list1.add("홍길동");

//		System.out.println(list1);
//		System.out.println("저장된 자료 수: " + list1.size());
//
//		for (int i = 0; i < list1.size(); i++) {
//			Product p1 = (Product) list1.get(i);
//			System.out.println("제품 가격: " + p1.price);
//		}

		// 제네릭
		List<Product> list2 = new ArrayList<Product>();
		list2.add(new Product("볼펜", 1500));
		list2.add(new Product("매직키보드", 10000));
		list2.add(new Product("지우개", 500));
		list2.add(new Product("마우스", 25000));
		list2.add(new Product("USB허브", 55000));
//		list2.add("홍길동");

//		for (int i = 0; i < list2.size(); i++) {
//			Product p2 = list2.get(i); // cast 연산자 생략
//			System.out.println("제품명: " + p2.pName);
//		}
		
		// 반복자를 이용한 검색
		Iterator<Product> iter = list2.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
	}
}

class Product {
	String pName;
	int price;

	Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "제품명: " + pName + " => " + price + "원";
	}
}