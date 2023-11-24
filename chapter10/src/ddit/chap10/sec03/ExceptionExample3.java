package ddit.chap10.sec03;

import java.util.Scanner;

public class ExceptionExample3 {
	static String[] name = new String[5];

	public static void main(String[] args) {
		setArray();
		try {
			System.out.println("회원이름: "+getArray());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류가 발생됨.");
			System.out.println("배열에 저장된 회원 수를 체크하시오.");
		}
	}

	public static void setArray() {
		name = new String[] { "홍길동", "이순신", "강감찬", "이성계", "정몽주" };
	}

	public static String getArray() throws ArrayIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원의 순번 입력: ");
		int idx = sc.nextInt();
		sc.close();

		return name[idx];
	}
}