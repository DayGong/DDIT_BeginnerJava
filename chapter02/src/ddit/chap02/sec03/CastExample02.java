package ddit.chap02.sec03;

public class CastExample02 {

	public static void main(String[] args) {
		// 문자열(String 객체) → 기본형(byte, short, int, long, float, double, char, boolean)
		// 바꿀 타입의 Wrapper클래스.parse타입명(문자열)
		// Wrapper클래스				타입명
		// byte → Byte					Byte
		// short → Short					Short
		// int → Integer					Int
		// long → Long					Long
		
		// float → Float					Float
		// double → Double			Double
		
		// char → Character			Char
		
		// boolean → Boolean		Boolean
		
		float f = 0.1f;
		double d = 0.1;
		
		String val1 = "1234";
		
		float res1 = Float.parseFloat(val1);
		int res2 = Integer.parseInt(val1, 16);
		
		System.out.println(res1 + 10);
		System.out.println(res2);
	}

}
