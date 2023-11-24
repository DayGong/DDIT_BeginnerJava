package ddit.chap10.sec03;

import java.util.Scanner;

public class ExceptionExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별명 입력: ");
		String nickName = sc.nextLine();

		try {
			inputNickName(nickName);
		} catch (RuntimeException e) {
			System.out.println("금지어가 포함된 별명 입력");
		}
	}

	public static void inputNickName(String nickName) {
		if (nickName.equals("바보")) {
			throw new NickNameException();
		}
	}
}

class NickNameException extends RuntimeException {
	NickNameException() {
		super("잘못된 별명입니다.");
	}
}