package ddit.chap02.sec02;

public class FloatingExample {

	public static void main(String[] args) {
		FloatingExample fe = new FloatingExample();
//		fe.floatMethod();
		fe.doubleMethod();
	}

	void floatMethod() {
		// float(4byte): 부호(1bit), 지수(8bit), 가수(23bit)
		// 표현 범위: 1.4e-45 ~ 3.4e+38
		// literal 끝에 'F'나 'f' 추가해야함(실수의 기본 타입은 double형이기 때문)

//		float pi = 3.1415926F;

		int sum = 245;
		float avg = sum / 3F;

		System.out.printf("평균 = %6.2f", avg); // %6.2f는 6자릿수 확보하되 우측 정렬(좌측 정렬은 -), 소수점 이하 2자릿수로 반올림
//		System.out.println();
	}

	void doubleMethod() {
		// double(8byte): 부호(1bit), 지수(11bit), 가수(52bit)
		// 표현 범위: 4.9e-324 ~ 1.8e+308
		// 기본 실수형
		// literal 끝에 'D', 'd', 생략

		double d1 = 0.1;
		double d2;

		float f1 = 0.1F;
		d2 = f1;

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

		if (d1 == f1) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
	}
}
