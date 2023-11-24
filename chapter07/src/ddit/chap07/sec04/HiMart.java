package ddit.chap07.sec04;

public class HiMart {
	public static void main(String[] args) {
//		Customer cust = new Customer();
//
//		cust.buy(new Tv());
//		cust.buy(new Computer());
//		cust.buy(new SmartPhone());
//
//		cust.summary();
//
		Goods g1 = new Tv();
//		g1.printInfo();

		// downcast
		Tv t1 = (Tv) g1;
		t1.printInfo();

		if (g1 instanceof Computer) {
			Computer c1 = (Computer) g1;
		} else if (g1 instanceof Tv) {
			Tv t2 = (Tv) g1;
			t2.printInfo();
		}
	}
}