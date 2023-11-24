package ddit.chap04.sec01;

import java.util.Scanner;

//키보드로 점수를 입력 받아 학점 출력
// 97~100: A+
// 93~96: A0
// 90~92: A-
// 87~89: B+
// 83~86: B0
// 80~82: B-
// 그 이하: F 학점
public class SwitchExample04 {
	public static void main(String[] args) {
		new SwitchExample04().switchMethod();
	}

	public void switchMethod() {
		Scanner sc = new Scanner(System.in);
		String grade = "";

		System.out.print("점수 입력: ");
		int score = sc.nextInt();

		switch (score / 10) {
		case 10:
			grade = "A+";
			break;

		case 9:
			grade = "A";
			switch (score % 10) {
			case 7:	case 8:	case 9:
				grade += "+";
				break;

			case 3:	case 4:	case 5:	case 6:
				grade += "0";
				break;

			default:
				grade += "-";
			}
			break;

		case 8:
			grade = "B";
			switch (score % 10) {
			case 7:	case 8:	case 9:
				grade += "+";
				break;

			case 3:	case 4:	case 5:	case 6:
				grade += "0";
				break;

			default:
				grade += "-";
			}
			break;

		default:
			grade = "F";
		}
		System.out.println(score + " => " + grade);
	}
}