package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		// boolean(1byte): true(참), false(거짓)
		// 조건문(관계 연산자 또는 논리 연산자가 사용되어진 수식)의 결과
		
		double d = 0.1;
		float f = 0.1F;
		
		int age = 19;
		int year = 2024;
		
		boolean b1 = (d == f);
		
		System.out.println(age > 18);
		System.out.println("b1 = " + b1);
		System.out.println( ( (year%4==0 && year%100 != 0) || (year%400==0) ) ); // 윤년 계산
	
	}

}
