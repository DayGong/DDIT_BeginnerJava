package ddit.chap07.sec04;

public class Tv extends Goods {
	
	Tv() {
		super(5000);
	}
	
	@Override
	public String toString() {
		return "LG ThinQ 60";
	}
	
	public void printInfo() {
		System.out.println("제조회사명: LG 전자");
	}
}