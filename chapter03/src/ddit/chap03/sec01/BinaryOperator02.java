package ddit.chap03.sec01;

import java.util.Scanner;

public class BinaryOperator02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator02 obj = new BinaryOperator02();

//		obj.bitOperator01();
		obj.bitOperator02();
	}

	public void bitOperator01() {
		int a = 45;
		int b = 25;
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
		System.out.println("~" + a + " = " + (~a));
	}
	
	public void bitOperator02() {
		// a >> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동(부호 bit는 이동되지 않음)
		//발생되는 왼쪽의 빈 공간은 부호 bit가 확장
		//a를 2의 b승으로 나눈 몫을 반환
		// a << b : 정수 a의 각 비트를 b만큼 왼쪽으로 이동(부호 bit는 이동되지 않음)
		//발생되는 오른쪽의 빈 공간은 '0'이 pedding
		//a를 2의 b승을 곱한 몫을 반환
		// a >>> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동(부호 bit도 이동)
		//발생되는 왼쪽의 빈 공간은 '0'이 pedding
		
	}
}
