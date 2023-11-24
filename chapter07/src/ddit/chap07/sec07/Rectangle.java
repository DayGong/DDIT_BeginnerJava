package ddit.chap07.sec07;

public class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle(String kind, String color, int width, int height) {
		super(kind, color);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(kind + " 도형을 그립니다.");
	}

	public int getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return super.toString() + "\n면적: " + getArea();
	}
}
