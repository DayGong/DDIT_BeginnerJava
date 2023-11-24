package ddit.chap02.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 형변환(Promotion): cast연산자 불필요
		// byte < short < int < long < float < double
		// char 타입은 음수가 없기 때문에 byte나 short가 char로 변환 불가
		// 수식에서 int보다 작은 타입(byte, short, char)은 int로 자동 형변환
		
		byte b = 100;
		int res = b * 10; // b의 타입이 int로 변환
		
//		char ch1 = b1;
		short sh = 100;
//		char ch2 = sh;
	}

}
