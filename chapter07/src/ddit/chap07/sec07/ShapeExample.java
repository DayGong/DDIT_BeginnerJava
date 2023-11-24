package ddit.chap07.sec07;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Circle("원", "보라색", 2.5);
		s1.draw();
		System.out.println(s1.toString());
		
		
		s1 = new Rectangle("직사각형", "빨간색", 10, 10);
		// s1 변수가 Rectangle 객체를 가르키게 된 후
		// Garbage Collection로인해 Circle 객체는 heap 메모리에 더이상 존재하지않음
		s1.draw();
		System.out.println(s1);
	}
}
