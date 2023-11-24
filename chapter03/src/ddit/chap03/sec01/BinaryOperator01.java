package ddit.chap03.sec01;

import java.util.Scanner;

public class BinaryOperator01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator01 obj = new BinaryOperator01();

//		obj.arithmeticOper();
//		obj.realtaionOper1();
//		obj.realtaionOper2();
		obj.realtaionOper3();
	}

	public void arithmeticOper() {
		// 산술 연산자 +, -, *, /, %
		int a = 5;
		int b = 2;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + ((double) a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
	}

	public void realtaionOper1() {
		// 비교 연산자 >, <, ==, >=, <=, !=
		System.out.print("첫번째 숫자를 입력해주세요: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + "은/는 " + b + "보다 크다.");
		}
		if (a < b) {
			System.out.println(a + "은/는 " + b + "보다 작다.");
		}
		if (a == b) {
			System.out.println(a + "와 " + b + "는 같다.");
		}
		if (a >= b) {
			System.out.println(a + "은/는 " + b + "보다 크거나 같다.");
		}
		if (a <= b) {
			System.out.println(a + "은/는 " + b + "보다 작거나 같다.");
		}
		if (a != b) {
			System.out.println(a + "와 " + b + "는 같지 않다.");
		}
	}

	public void realtaionOper2() {
		// 점수를 입력받아 학점을 부여
		// A 90 이상, B 80, ..., F

		System.out.print("점수를 입력해주세요: ");
		int score = sc.nextInt();

		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

	public void realtaionOper3() {
		// 논리 연산자: &&, ||, !
//		if (true && true) {
//			System.out.println("둘 다 참");
//		}
//		if (true || false) {
//			System.out.println("둘 중 하나만 참");
//		}

		// 0보다 크고 10보다 작은지 확인
//		System.out.print("숫자를 입력해주세요: ");
//		int a = sc.nextInt();
//
//		if (0 < a && a < 10) {
//			System.out.println("0보다 크고 10보다 작음");
//		} else {
//			System.out.println("0보다 크고 10보다 작지 않음");
//		}

		// 년도를 입력받아 윤년과 평년을 판별
		// 윤년: 4의 배수면서 100의 배수가 아니고, 400의 배수가 되는 해

		// 1992 1996 2004 2008: 윤년 (4의 배수 중 100의 배수는 아닌 해)
		// 1900 2100 평년 (4의 배수 중 100의 배수가 되는 해)
		// 2000 2400 윤년 (4의 배수 중 400의 배수가 되는 해)

		/*
		 * 힌트
		if (year % 4 == 0) {
			System.out.println("4의 배수입니다.");
		}
		if (year % 100 != 0) {
			System.out.println("100의 배수가 아닙니다.");
		}
		if (year % 400 == 0) {
			System.out.println("400의 배수입니다.");
		}
		*/

		System.out.print("연도를 입력해 주세요: ");
		int year = sc.nextInt();
		
		boolean four = (year%4 ==0);
		boolean not100 = (year%100 != 0);
		boolean four100 = (year%400 == 0);

		if ( (four && not100) || (four100) ) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년 입니다.");
		}
	}

}
