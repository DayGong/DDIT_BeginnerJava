package ddit.chap03.sec02;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		// 클래스 객체 생성
		// 클래스명 객체변수명 = new 클래스명();
		UnaryOperator oper = new UnaryOperator();
//		oper.incrementOperator();
		oper.complementMethod();
	}
}

class UnaryOperator {
	public void incrementOperator() {
		// 증가 연산자: ++
		// 단항 연산자, 변수의 값을 1씩 증가
		// ++변수: 전위식 표기법(prefix) - '변수' 자신은 1증가 된 값을 가지고 증가된 값을 반환(증가가 일어나고 배정이 일어남)
		// 변수++: 후위식 표기법(postfix) - '변수' 자신은 1증가 된 값을 가지고 증가되기 전 값을 반환(배정이 일어나고 증가가 일어남)
		int[] num = {10, 20, 30, 40, 50};

		int j  = 4;
		
		System.out.println(num[j++]);
		System.out.println(num[++j]); //오류
//		
//		int i = 10;
//		
//		i++;
//		System.out.println("i = "+i);
//
//		i = 10;
////		int res = i++;
//		int res = ++i;
//		System.out.println("i = "+i);
	}

	public void complementMethod() {
		// ~: 1의 보수 연산자
		int val = 10;
		
		System.out.println("val = " + val);
		
		int val1 = ~val;
		System.out.println("val의 1의 보수 = " + val1);
	}
}