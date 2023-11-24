package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample03 {
	public static void main(String[] args) {
		// 배열 복사
		ArrayCopy ac = new ArrayCopy();

//		ac.arrayMethod01();
//		ac.deepCopy01();
//		ac.deepCopy02();
		ac.deepCopy03();
	}
}

class ArrayCopy {
	public void arrayMethod01() {
		String[] word = { "apple", "banana", "persimmon", "melon", "lemon" };

		String rndWord = selectOne(word);
		System.out.println(rndWord);
	}

	public String selectOne(String[] fname) {
		Random r = new Random();
		fname[2] = "호두";
		int rnd = r.nextInt(5); // 0~4사이의 정수형 난수 발생

		return fname[rnd];
	}

	public void deepCopy01() {
		// clone()를 이용한 배열 복사

		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = source.clone();

		System.out.println("원본 배열" + Arrays.toString(source));
		System.out.println("복사 배열" + Arrays.toString(target));

	}

	public void deepCopy02() {
		// System.arraycopy(원본 배열명, 복사해 줄 위치,복사 배열명,복사 받을 위치,개수);
		int[] source = { 90, 70, 85, 76, 95 };

		int[] target = new int[10];
		System.arraycopy(source, 0, target, 5, source.length);
		
		System.out.print("source: ");
		for (int i = 0; i < source.length; i++) {
			System.out.printf("%3d, ", source[i]);
		}
		
		System.out.print("\ntarget: ");
		for (int i = 0; i < target.length; i++) {
			System.out.printf("%3d, ", target[i]);
		}
	}
	
	public void deepCopy03() {
		// for문을 이용하는 방법
		int[] source = { 90, 70, 85, 76, 95 };
		int[] target = new int[5];
		
		System.out.println("source: "+Arrays.toString(source));
		System.out.println("target: "+Arrays.toString(target));
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		System.out.println("복사 후");
		System.out.println("source: "+Arrays.toString(source));
		System.out.println("target: "+Arrays.toString(target));
	}
}
