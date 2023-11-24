package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchExample03 {
	public static void main(String[] args) {
		// 수도 요금을 계산하시오
		// 사용량(톤) 별 단가
		// 0~9: 200
		// 10 ~ 19: 250
		// 20 ~ 29: 350
		// 30 ~ 39: 500
		// 그 이상: 750
		// 하수도 사용료: 톤당 150원
		// 수도 요금 = 사용량별 요금 + 하수도 요금 + 물 이용 부담금(3000)
		// ex) 26톤 사용 시: ((200*9) + (250*10) + (350*7)) + (26*150) + 3000
		SwitchState03 ss03 = new SwitchState03();
		ss03.inputAmount();
	}
}

class SwitchState03 {
	int sum; // 납부 금액
	Scanner sc = new Scanner(System.in);

	public void inputAmount() {
		System.out.print("사용량(톤)을 입력: ");
		int amtWater = sc.nextInt();

		switch (amtWater / 10) {
		case 0:
			sum = (amtWater * 200) + (amtWater * 150) + 3000;
			break;

		case 1:
			sum = (200 * 9) + (250 * (amtWater - 9)) + (amtWater * 150) + 3000;
			break;

		case 2:
			sum = (200 * 9) + (250 * 10) + (350 * (amtWater - 19)) + (amtWater * 150) + 3000;
			break;

		case 3:
			sum = (200 * 9) + (250 * 10) + (350 * 10) + (500 * (amtWater - 29)) + (amtWater * 150) + 3000;
			break;

		default:
			sum = (200 * 9) + (250 * 10) + (350 * 10) + (500 * 10) + (750 * (amtWater - 39)) + (amtWater * 150)
					+ 3000;
		}

		System.out.printf("수도 사용량: %2d톤  수도요금: %6d원", amtWater, sum);
	}
}