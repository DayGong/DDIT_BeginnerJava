package ddit.chap02.sec02;

public class IntegerExample {

	public static void main(String[] args) {
//		byteMethod();
//		shortMethod();
//		intMethod();
		longMethod();
	}

	public static void byteMethod() {
		// byte 타입의 값의 범위: 127 ~ -128
		// 위 값을 초과하는 literal 사용: 오류
		// =연산자 오른쪽의 결과값이 위 범위를 벗어나면 순환적용된 값을 저장

		byte b1 = 10;
		System.out.println("b1 = " + b1);

		byte b2 = 127;
		byte b3 = -128;
		byte res = (byte) (b2 + 3);
		b3 = (byte) (b3 - 3);

		System.out.println("b2 (127 + 3) = " + res);
		System.out.println("b3 (-128 - 3)= " + b3);
	}

	public static void shortMethod() {
		// short(2byte): 32767 ~ -32768
		// 위 값을 초과하는 literal 사용: 오류
		// =연산 결과값이 위 범위를 벗어나면 순환적용된 값을 저장

		short s1 = 32767;
		s1++;

		System.out.println("s1 = " + s1);
	}

	public static void intMethod() {
		// int(4byte): 2147483647 ~ -2147483648
		// 기본 정수형

		int kor = 80;
		int mat = 90;
		int eng = 75;

		int sum = kor + mat + eng;

		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + sum/3); // 정수와 정수의 연산 결과는 정수
	}
	
	public static void longMethod() {
		// long(8byte): 2^63-1 ~-2^63
		// literal 끝에 'L' 또는 'l'을 추가하여 long 타입의 자료임을 나타내야함
		
		long l1 = 10000000000L;
		long l2 = 1000000;
		
		System.out.println(l1);
		System.out.println(l2);
	}
	
}
