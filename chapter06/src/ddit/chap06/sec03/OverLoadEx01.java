package ddit.chap06.sec03;

// 여러 종류의 자료를 입력받아 삼각형의 넓이를 반환하는 메서드(getTriangleArea())를 작성
// 데이터의 종류는 다음과 같다.
// (int, float), (double, int), (int, int)
public class OverLoadEx01 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("삼각형 넓이 = " + t.getTriangleArea(15));
		System.out.println("삼각형 넓이 = " + t.getTriangleArea(15, 31.3f));
		System.out.println("삼각형 넓이 = " + t.getTriangleArea(15, 31));
		System.out.println("삼각형 넓이 = " + t.getTriangleArea(15));

	}
}

class Triangle {
	float getTriangleArea(int width, float height) {
		System.out.println("1번째");
		float res = width * height / 2;
		return res;
	}

	double getTriangleArea(double width, int height) {
		System.out.println("2번째");
		return width * height / 2;
	}

	int getTriangleArea(int width, int height) {
		System.out.println("3번째");
		return width * height / 2;
	}

	int getTriangleArea(int height) {
		System.out.println("4번째");
		return height * height / 2;
	}
}
