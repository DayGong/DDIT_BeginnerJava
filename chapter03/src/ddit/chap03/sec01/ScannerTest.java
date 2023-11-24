package ddit.chap03.sec01;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		int a = 3;
//		System.out.print("숫자를 입력해주세요: ");
//		int i = sc.nextInt();
//		int result = a + i;
//		System.out.println("입력 받은 숫자 " + i + "와 숫자 " + a + "를 더한 결과 값은 " + result);
		
		System.out.print("문자를 입력해주세요: ");
//		String s = sc.next();
//		System.out.println("입력 받은 문자는 " + "\"" + s + "\"" + " 입니다.");
		String s2 = sc.nextLine();
		System.out.println("입력 받은 문자는 " + "\"" + s2 + "\"" + " 입니다.");
	}
}
