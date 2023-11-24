package ddit.chap06.sec01;

public class Product {
	static int prodNo = 1000;
	
	Product() {
		prodNo++;
	}
	
	@Override
	public String toString() {
		return "제품번호: "+prodNo;
	}
}
