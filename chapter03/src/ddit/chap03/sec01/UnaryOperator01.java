package ddit.chap03.sec01;

import java.util.Scanner;

public class UnaryOperator01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator01 obj = new UnaryOperator01();

//		obj.signOperator1();
		obj.signOperator2();
	}
	
	public void signOperator1() {
		// 1. 부호 연산자
		int num = 100;
		int result = - num;
		System.out.println("num = "+num);
		System.out.println("result = "+result);
	}
	

	public void signOperator2() {
		// 증감 연산자
		// ++변수 연산 수행 전에 피연산자의 값을 1 증가 시킴
		// 변수++ 연산 수행 후에 피연산자의 값을 1 증가 시킴
		// --변수 연산 수행 전에 피연산자의 값을 1 감소 시킴
		// 변수-- 연산 수행 후에 피연산자의 값을 1 감소 시킴
		
		int a = 1;
		int val = a++;
		
//		a++;은 아래와 같다.
//		int val = a;
//		a += 1;
		
//		++a;는 아래와 같다.
//		a += 1;
//		int val = a; 
		
		System.out.println(a);
		System.out.println(val);
		
		int b = 2;
		int val2 = b--;
		
//		b--;은 아래와 같다.
//		int val2 = b;
//		b -= 1;
		
//		--b;는 아래와 같다.
//		b -= 1;
//		int val2 = b; 
		
		System.out.println(b);
		System.out.println(val2);
	}
}
