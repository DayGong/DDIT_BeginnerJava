package ddit.chap04.sec02;

import java.util.Scanner;

public class ForStatementExample01 {
	public static void main(String[] args) {
		ForStatement01 for01 = new ForStatement01();
		
//		for01.forMethod01();
//		for01.forMethod02();
		for01.fibonacci();
	}
}

class ForStatement01 {
	Scanner sc = new Scanner(System.in);

	// 1~10까지의 합을 구하시오
	void forMethod01() {
		int sum=0;
		
		for(int i=1; i<11; i++) {
			sum += i;
		}
		
		System.out.println("1~10까지의 합= " + sum);
	}
	
	// 키보드로 2~9 사이의 숫자를 입력 받아 해당 숫자의 구구단을 출력하시오.
	void forMethod02() {
		System.out.print("단 입력(2~9): ");
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" * "+ i + " = " + dan*i);
		}
	}

	// 1~50 사이에 존재하는 피보나치 수열 값을 출력
	// 1, 1, 2, 3, 5, 8, ...
	void fibonacci() {
		int ppn = 1;
		int pn = 1;
		int cn = 0;
		
		System.out.print(ppn + ", " + pn + ", ");

		for (int i = 0; i < 50; i++) {
			cn = ppn + pn;
			if(cn>=50) {
				break;
			}
			System.out.print(cn + ", ");
			ppn = pn;
			pn = cn;
		}
	}
	
}
