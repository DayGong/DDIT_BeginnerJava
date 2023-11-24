package ddit.chap03.sec02;

import java.util.Scanner;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		BinaryOperator bOper = new BinaryOperator();
//		bOper.arithmeticOperator();
//		bOper.arithmeticOperator01();
//		bOper.bitWiser();
		bOper.shiftOperator();
	}
}

class BinaryOperator {
	Scanner sc = new Scanner(System.in); // ��� �ʵ�

	public void arithmeticOperator() {
		// 산술 연산자: +, -, *, /, %
		// 숫자를 입력 받아서 짝수, 홀수 판별
		// ** 키보드로 자료를 입력받는 방법
		// System.in.read() : try~catch 블록에 기술해야하고 하나의 글자(char)를 입력 받아 int 타입의 값으로 반환됨
		// Scanner 클래스: java.util 패키지에 있는 API 클래스(사용할 때 import 필요: import java.util.Scanner), 사용자가 키보드로 입력 받는 자료를 반환

		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "은 홀수입니다.");
		}
	}

	public void arithmeticOperator01() {
		// 관계 연산자: ==, >, < >=, <=, !=(<>)
		// 논리 연산자: !, &&, ||
		
		//  입력                  출력
		//--------------------------------------------
		//  A   B       AND(&&)   OR(||)   EX-OR
		//  0   0            0             0          0  
		//  0   1            0             1          1
		//  1   0            0             1          1
		//  1   1            1             1          0
		
		// 10세 이상의 나이를 입력 받아 연령대를 출력하시오
		/* 첫번째 방법
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if(age > 9 && age < 20) {
			System.out.println("10대 입니다.");
		} else if (age > 19 && age < 30) {
			System.out.println("20대 입니다.");
		} else if (age > 29 && age < 40) {
			System.out.println("30대 입니다.");
		} else if (age > 39 && age < 50) {
			System.out.println("40대 입니다.");
		} else if (age > 49 && age < 60) {
			System.out.println("50대 입니다.");
		} else {
			System.out.println("60대 이상입니다.");
		}
		*/
		
		/* 두번째 방법 */
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		System.out.println(age + "는 " + ((age/10)*10) + "대입니다.");
	}

	public void bitWiser()  {
		int v1 = 25;
		int v2 = 17;
		
		int resAnd = v1 & v2;
		int resOr = v1 | v2;
		int resEor = v1 ^ v2;
		
		System.out.println(v1 + " & " + v2 + " = " + resAnd);
		System.out.println(v1 + " | " + v2 + " = " + resOr);
		System.out.println(v1 + " ^ " + v2 + " = " + resEor);
	}

	public void shiftOperator() {
		int num = 23;
		
		System.out.println(num + " >> 2  ⇒ " + (num>>2));
		System.out.println(num + " << 2  ⇒  " + (num<<2));
		
		byte num1 = -2;
		
		System.out.println(num1 + " >>> 2 ⇒ " + ((byte)num1>>>2));
	}
}