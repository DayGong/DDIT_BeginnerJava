package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample04 {
	public static void main(String[] args) {
		// 로또번호 생성기(1~45)
		Lotto lotto = new Lotto();
		Scanner sc = new Scanner(System.in);

		System.out.print("구매 금액(1000원 단위): ");
		int money = sc.nextInt();

		for (int i = 0; i < money / 1000; i++) {
			int[] lnum = lotto.shuffle();
			System.out.print((i + 1) * 1000 + "원: ");
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d", lnum[j]);
			}
			System.out.println();
		}
	}
}

class Lotto {
	int[] lottoNum;

	// 매서드 생성자
	Lotto() {
		lottoNum = new int[45];
		for (int i = 0; i < lottoNum.length; i++) { // 0~44
			lottoNum[i] = i + 1; // 1~45
		}
	}

	// 배열의 0번째 요소와 난수번째 요소를 교환
	int[] shuffle() {
		for (int i = 0; i < 10000000; i++) {
			int r = (int) (Math.random() * lottoNum.length);
			int temp = lottoNum[0];
			lottoNum[0] = lottoNum[r];
			lottoNum[r] = temp;
		}
		return lottoNum;
	}

}