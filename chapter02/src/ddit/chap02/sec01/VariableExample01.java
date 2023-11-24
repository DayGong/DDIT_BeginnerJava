package ddit.chap02.sec01;

import java.util.Scanner;

public class VariableExample01 {
	static int var1; // 멤버 필드
	int var2; // 전역 변수

	public static void main(String[] args) {
		VariableExample01 ve = new VariableExample01();
		ve.var2 = 10;

		int var1 = 10;
		char ch1 = 's';
		String s1 = "string";

//		int var1 = 10;
//		int result=var1+100;
//		
//		System.out.println("var1 = " + var1);
//		System.out.println("result =" + result);

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");

		int age = sc.nextInt(); //  enter키 누르기 전까지 숫자 입력
		sc.close();

		String str = null;
		if (age >= 18) {
			str = age + "세는 18세 이상이므로 성년입니다.";
		} else {
			str = age + "세는 18세 이하이므로 미성년입니다.";
		}
		System.out.println(str);
	}
}