package ddit.chap05.sec02;

import java.util.Arrays;

// 주사위를 50번 던져서 나온 각 눈의 수로 그래프(히스토그램)를 작성하시오
public class ArrayExample06 {
	public static void main(String[] args) {
		Dice d = new Dice();
		d.setDice();
//		d.showDiagram();
		d.changeDim();
	}
}

class Dice {
	int[] dice = new int[6]; // 1~6의 눈이 나온 경우의 수
	char[][] histo;
	
	public void setDice() {
		for (int i = 0; i < 50; i++) {
			int r = (int) (Math.random() * 6) + 1; // 1~6 사이의 난수
			dice[r - 1]++; // 발생된 난수에 따라 해당 영역의 횟수 증가
		}
		System.out.println(Arrays.toString(dice));
	}

	public void showDiagram() {
		System.out.println("  [[히스토그램]] ");
		for (int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "|");
			for (int j = 0; j < dice[i]; j++) {
				System.out.print("#");
			}
			System.out.println(dice[i]);
		}
	}

	public void changeDim() {
		int rowCount = getMaxValue(); // 행의 수
		histo = new char[rowCount][6];
		setChar(histo);
		printHistoGram(histo);
	}

	public int getMaxValue() {
		int tmax = dice[0];
		for (int i = 0; i < dice.length; i++) {
			if (tmax < dice[i]) {
				tmax = dice[i];
			}
		}
		return tmax;
	}

	public void setChar(char[][] histo) {
		for (int j = 0; j < 6; j++) { // major column method = 열첨자
			for (int i = 0; i < dice[j]; i++) { // 행첨자
				histo[i][j] = '#';
			}
		}
		System.out.println();
	}

	public void printHistoGram(char[][] twoDimArr) {
		System.out.println("\n           [[주사위 실험결과]]");
		
		for (int i = twoDimArr.length - 1; i >= 0; i--) {
			if ((i + 1) % 5 == 0) {
				System.out.printf("%-6d", (i + 1));
			} else {
				System.out.print("|      ");
			}

			for (int j = 0; j < twoDimArr[i].length; j++) {
				System.out.print(twoDimArr[i][j] + "       ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		System.out.println("       1   |   2   |    3   |   4   |    5   |   6");
	}
}