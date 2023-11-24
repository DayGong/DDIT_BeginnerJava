package ddit.chap06.sec06;

public class Account {
	private String accNO;
	private int balance;
	
	private static Account instance = null;

	private Account(String accNo) {
		this.accNO = accNo;
	}
	
	public String getAccNo() {
		return accNO;
	}

	public static Account getInstance() {
		if (instance == null) {
			instance = new Account("123456");
		}
		return instance;
	}
	
	// 입금
	public void deposit(int inputMoney) {
		this.balance += inputMoney;
	}

	// 출금
	public int withdraw(int outputMoney) {
		int res = 0;

		if (balance >= outputMoney) {
			balance -= outputMoney;
			res = outputMoney;
		} else {
			System.out.println("잔고 부족");
			res = 0;
		}

		return res;
	}

	// 잔액조회
	public int getBalance() {
		return balance;
	}
}
