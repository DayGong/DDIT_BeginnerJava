package ddit.chap02.sec03;

public class CastExample {

	public static void main(String[] args) {
		// cast: 강제 형변환
		// cast 연산자: (타입) 필요
		
		byte b1 = 10;
		short s1 = 100;
		
		// int보다 작은 타입은 int로 변환되기 때문에 s1과 b1이 int값이 됨
		short res = (short)(s1 + b1); // int보다 작은 타입은 int로 변환되기 때문에 s1과 b1이 int값이 됨
		System.out.println(res);
		
		// d1을 소수점 2자리에서 반올림해라
		double d1 = 34.56789;
		
		d1 *= 10;
		System.out.println(d1);
		
		d1 += 0.5;
		System.out.println(d1);
		
		int result = (int)d1;
		System.out.println(result);
		
		d1 = (double)result / 10;
		System.out.println(d1);
	}

}
