package ddit.chap10.sec01;

// 1/10 + 1/9 + 1/8 + ... + 1/1 = ?
public class ExceptionExample01 {
	public static void main(String[] args) {
		double sum = 0;
		try {
			for (int i = 10; i >= 0; i--) {
				sum += (1 / i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
			System.out.println("result = " + sum);
//		}
	}
}