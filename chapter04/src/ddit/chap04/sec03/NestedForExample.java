package ddit.chap04.sec03;

public class NestedForExample {
	public static void main(String[] args) {
		NestedFor nestedFor = new NestedFor();

//		nestedFor.nestedMethod01();
//		nestedFor.nestedMethod02();
//		nestedFor.nestedMethod03();
//		nestedFor.nestedMethod04();
//		nestedFor.nestedMethod05();
		nestedFor.nestedMethod06();
	}
}

class NestedFor {
//	1)
//	*****
//	*****
//	*****
//	*****
//	*****
	public void nestedMethod01() {
		for (int i = 0; i < 5; i++) { // 줄 수
			for (int j = 0; j < 5; j++) { // 각 줄에 출력되는 문자의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	2)
//	*
//	**
//	***
//	****
//	*****
	public void nestedMethod02() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	3)
//	*****
//	****
//	***
//	**
//	*
	public void nestedMethod03() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	4)
//	*****
//	 ****
//	  ***
//	   **
//	    *
	public void nestedMethod04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	5)
//	     *
//	    **
//	   ***
//	  ****
//	 *****
	public void nestedMethod05() {
		for (int i = 0; i < 5; i++) { // 줄 수
			for (int j = 0; j < (4 - i); j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//  6)
//      *
//     ***
//    *****
//   *******
//  *********
	public void nestedMethod06() {
		for (int i = 0; i < 5; i++) { // 줄 수
			for (int j = 0; j < (4 - i); j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}