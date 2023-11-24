package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {
	public static void main(String[] args) {
		IfStatement01 ifstate01 = new IfStatement01();
		
//		ifstate01.ifMethod01();
//		ifstate01.ifMethod02();
//		ifstate01.ifMethod03();
//		ifstate01.ifMethod04();
		ifstate01.ifMethod05();
	}
}

class IfStatement01 {
	Scanner sc = new Scanner(System.in); // 멤버 필드
	int score;

	// 키보드로 점수를 입력 받아 60점 이상이면 "합격입니다" 출력
	public void ifMethod01() {
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if ( score > 59 ) { // JAVA는 = 명령을 선호하지않음
			System.out.println("합격입니다.");
		}
	}
	
	// 키보드로 점수를 입력 받아 60점 이상이면 "합격입니다", 미만이면 "불합격입니다" 출력
	public void ifMethod02() {
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		if ( score > 59 ) { // JAVA는 = 명령을 선호하지않음
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	// 키보드로 점수를 입력 받아 학점 출력
	// 90~100: A 학점, 80~89: B 학점. 70~ 79: C 학점, 60 ~ 69: D 학점, 그 이하: F 학점
	public void ifMethod03() {
		String grade = "";
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if (score > 89) {
			grade = "A";
		} else if (score > 79) {
			grade = "B";
		} else if (score > 69) {
			grade = "C";
		} else if (score > 59) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		
	}
	
	// 키보드로 점수를 입력 받아 학점 출력
	// 97~100: A+, 93~96: A0, 90~92: A-
	// 87~89: B+, 83~86: B0, 80~82: B-
	// 그 이하: F 학점
	public void ifMethod04() {		
		String grade = "";
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score >= 93) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (score >= 80){
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score >= 83) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		
		System.out.println(grade + " 학점");
	}
	
	// 년도를 입력 받아 윤년과 평년을 구별하여 "xxxx년은 윤년입니다." 출력
	// 윤년 : 해당 년도가 4의 배수면서 100의 배수가 아니거나, 400의 배수가 되는 해
	public void ifMethod05() {
		String year = "";
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if ((score % 4 == 0 && score % 100 != 0) || score % 400 == 0) {
			year = "윤년";
		} else {
			year = "평년";
		}
		
		System.out.println(score+"년은 "+year+"입니다.");
	}
	
}