package ddit.chap03.sec01;

public class MathTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;

		// a/b 소숫점 3째 자리까지 출력
		// type 변환 이용

		System.out.printf("%.3f",((double)a/b));

	}
}
