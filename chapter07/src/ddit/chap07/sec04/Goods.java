package ddit.chap07.sec04;

public class Goods {
	int price;
	int mileage;

	Goods(int price) {
		this.price = price;
		mileage = (int)(price * 0.01);
	}
}