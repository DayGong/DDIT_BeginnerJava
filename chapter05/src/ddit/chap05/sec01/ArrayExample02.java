package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample02 {
	public static void main(String[] args) {
		Sort sort = new Sort();

//		sort.bubbleSort();
		sort.selectionSort();
	}
}

class Sort {
	int[] num = { 27, 15, 92, 36, 47, 65, 70 };
	int[] source = num.clone();
	boolean f;

	public void bubbleSort() {
		System.out.println("정렬 전: " + Arrays.toString(num));
//		for (int i = 0; i < num.length; i++) {
//			System.out.printf("%3d, ", source[i]);
//		}

		for (int i = 0; i < (num.length - 1); i++) { // 회전
			f = true;
			for (int j = 0; j < (num.length - 1 - i); j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					f = false;
				}
			}
			if (f) {
				System.out.println("회전 수: " + (i + 1));
				break;
			}
		}

		System.out.println("정렬 후: " + Arrays.toString(num));
	}

	public void selectionSort() {
		System.out.println("정렬 전: " + Arrays.toString(source));

		for (int i = 0; i < source.length - 1; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] > source[j]) {
					int temp = source[i];
					source[i] = source[j];
					source[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후: " + Arrays.toString(source));
	}
}