package ddit.chap04.sec02;

public class WhileStatementExample01 {

	public static void main(String[] args) {
//		whileMethod01(); // static 메소드에서 static 메소드를 호출하는 것은 권장하지 않는 방법
//		whileMethod02();
		whileMethod03();
	}

	// 1~10까지의 합을 구하는 프로그램
	public static void whileMethod01() {
		int sum = 0; // 합(결과)이 저장
		int cnt = 0; // 1~10까지의 숫자

		while (cnt <= 10) {
			sum += cnt;
			cnt++;
		}

		System.out.println("합= " + sum);
	}

	// 1-2+3-4+...-10=?
	public static void whileMethod02() {
		int sum = 0; // 결과
		int cnt = 1; // 1~10까지의 숫자
		int sign = -1; // 부호

		while (cnt <= 10) {
			sign = sign * (-1);
			sum = sum + (sign * cnt);

			if (sign > 0 && cnt != 1) {
				System.out.print("+" + cnt);
			} else {
				System.out.print(sign * cnt);
			}
			cnt++;

		}
		System.out.println("=" + sum);
	}

	// 첫 날에 100원, 그 다음날부터 전날의 2배씩 저축을 할 때 최초로 100만원을 넘는 날과
	// 그날까지 저축한 액수를 구하시오.
	public static void whileMethod03() {
		int sum = 0;
		int amount = 100;
		int days = 0;

		while (sum <= 1000000) {
			sum = sum + amount;
			amount = 2 * amount;
			days++;
		}
		System.out.println("날 수 = " + days);
		System.out.println("저축액 = " + sum);
	}
}
