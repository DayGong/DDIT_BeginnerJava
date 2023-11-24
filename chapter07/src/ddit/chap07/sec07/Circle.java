package ddit.chap07.sec07;

public class Circle extends Shape {
	double radius;
	final double PI = 3.14;

	Circle(String kind, String color, double radius) {
		super(kind, color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println(kind + " 도형을 그립니다.");
	}

	public double getArea() {
		return (radius * radius) * PI;
	}

	@Override
	public String toString() {
		return super.toString() + "\n면적: " + getArea();
	}
}
