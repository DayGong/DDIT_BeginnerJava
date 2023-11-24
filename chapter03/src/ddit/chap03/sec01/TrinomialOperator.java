package ddit.chap03.sec01;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();

		obj.trinomialOperator();
	}

	public void trinomialOperator() {
		// 삼항 연산자: 3개의 피연산자를 필요로 하는 연산
		// 삼항 연산자는 ? 앞의 조건식의 결과에 따라 콜론 앞뒤의 피연산자가 선택됨
		// 조건 연산식이라고도 함
		// 조건식 ? 값 또는 연산식 : 값 또는 연산식
		//               |____true_______|
		//               |____________________false___________|

//		String s = true ? "참" : "거짓";
//		System.out.println(s);

		// 18세보다 많을 경우 성인 출력, 아닌 경우 미성년자 출력

//		System.out.print("나이를 입력해주세요: ");
//		int age = sc.nextInt();

//		String s2 = (age > 18) ? "성인입니다." : "미성년자입니다.";
//		System.out.println(s2);
//		String s3 = (age <= 18) ? "미성년자입니다." : "성년입니다.";
//		System.out.println(s3);

		// 10보다 큰 경우 나누기 2, 10보다 작은 경우 나누기 3
		System.out.print("숫자를 입력해주세요: ");
		int i = sc.nextInt();
		double num = 10>i ? i/3.0 : i/2.0 ;
		System.out.printf("계산 결과: %.2f", num);
		
		// 같은 수식
		if(10<i) {
			num = i/2.0;
		} else {
			num = i/3.0;
		}
	}
}