package ddit.chap06.sec06;

import java.util.Scanner;

// 은행계좌(Account) 클래스를 싱글톤(Singleton) 생성하시오
// 싱글톤(Singleton): 가장 간단한 디자인 패턴(design pattern)
//                            클래스 내부에서 해당 클래스 객체가 생성되며, 생성되는 객체의 수는 하나이다.
// 싱글톤 객체 생성 사용형식
// 멤버 필드: 계좌번호(String accNo), 잔고(int balance)
// 메서드: 생성자 메서드(계좌번호 설정)
//            입금(deposit-매개변수는 있고 반환타입은 없음)
//            출금(withdraw-매개변수와 반환타입 존재)
//            잔액조회(getBalance-매개변수 없고 반환타입은 있음)
public class BankExample {
	Scanner sc = new Scanner(System.in);
//	Account ac = new Account("918002");

	public static void main(String[] args) {
//		new BankExample().init();

		Account a1 = Account.getInstance();

		printBalance(a1);

		a1.deposit(50000);
		printBalance(a1);

		System.out.println("출금액수: " + a1.withdraw(1000000));
		printBalance(a1);

		System.out.println("출금액수: " + a1.withdraw(30000));
		printBalance(a1);

		Account a2 = Account.getInstance();
		System.out.println("============================");
		
		a2.withdraw(10000);
		printBalance(a1);
		printBalance(a2);

		System.out.println("a1" + a1);
		System.out.println("a2" + a2);
	}

//	void init() {
//		while (true) {
//			System.out.println("------------------------------------");
//			System.out.println("             [은행 시스템]");
//			System.out.println("------------------------------------");
//			System.out.println(" 1. 입금");
//			System.out.println(" 2. 출금");
//			System.out.println(" 3. 잔액조회");
//			System.out.println(" 9. 종료");
//			System.out.print("선택>> ");
//			int choice = sc.nextInt();
//
//			switch (choice) {
//			case 1:
//				System.out.println("------------------------------------");
//				System.out.println("                 [입금]");
//				System.out.println("------------------------------------");
//
//				System.out.print("입금할 금액:");
//				int inputMoney = sc.nextInt();
//
//				ac.deposit(inputMoney);
//				break;
//
//			case 2:
//				System.out.println("------------------------------------");
//				System.out.println("                 [출금]");
//				System.out.println("------------------------------------");
//
//				System.out.print("출금할 금액:");
//				int outputMoney = sc.nextInt();
//
//				int balance = ac.withdraw(outputMoney);
//				System.out.println("출금 액수: " + balance);
//				break;
//
//			case 3:
//				System.out.println("------------------------------------");
//				System.out.println("              [잔액조회]");
//				System.out.println("------------------------------------");
//				System.out.println("잔고: " + ac.getBalance());
//				break;
//
//			case 9:
//				System.out.println("은행 시스템을 종료합니다.");
//				System.exit(0);
//
//			default:
//				System.out.println("작업번호 선택 오류");
//			}
//		}
//	}

	public static void printBalance(Account acc) {
		System.out.println("계좌번호: " + acc.getAccNo());
		System.out.println("잔고: " + acc.getBalance() + "원");
		System.out.println("------------------------------------");
	}
}