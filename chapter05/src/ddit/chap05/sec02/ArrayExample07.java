package ddit.chap05.sec02;

// 최대/최소값
public class ArrayExample07 {
	public static void main(String[] args) {
		int[] num = { 23, 41, 15, 60, 39, 52, 12 };

		// 최대, 최소값
		int tmax = num[0];
		int tmin = num[0];

		for (int i = 1; i < num.length; i++) {
			if (tmax < num[i]) {
				tmax = num[i];
			}
			if (tmin > num[i]) {
				tmin = num[i];
			}
		}
		System.out.println("최댓값: " + tmax);
		System.out.println("최솟값: " + tmin);
	}
}
