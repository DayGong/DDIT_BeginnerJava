package ddit.chap02.sec02;

public class CharExample {
	
	public static void main(String[] args) {
		// Char(2byte): 부호 없는 2byte
		// 0 ~ 65535
		// byte, short가 char형으로 형변환 될 수 없음(char은 음수가 없기 때문)
		// ' ' 안에 표현
		
		char alpha = 'a';
		
		System.out.println(alpha);
		System.out.println((char)(alpha + 10));
		
		char ch1 = '대';
		
		System.out.println(ch1 + 0);
//		System.out.println((int)'가');
//		System.out.println((int)'힣');
		
		// A~Z까지 출력
		for (int i = 'A'; i <='Z' ; i++) {
			System.out.print((char)i);
		}
	}
	
}
