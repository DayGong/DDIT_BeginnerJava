package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		arrayMethod01();
	}

	public static void arrayMethod01() {
		// 'A' ~ 'Z' 배열에 저장하고 출력
		char[] alpha = new char[26];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i]=(char)(i+65);
			System.out.print(alpha[i]);
		}
		System.out.println(Arrays.toString(alpha));
	}
	
	public String toString() {
		return getClass().getName()+'@'+Integer.toHexString(hashCode());
	}
}
