package ddit.chap06.sec02;

import java.util.Scanner;

public class Grade {
	int Kor;
	int Math;
	int His;
	
	void inputGrade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		this.Kor = sc.nextInt();
		
		System.out.print("수학: ");
		this.Math = sc.nextInt();
		
		System.out.print("한국사: ");
		this.His = sc.nextInt();
	
		int sum = this.Kor+this.Math+this.His;
		
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.1f", sum/3.0);
	}
}
