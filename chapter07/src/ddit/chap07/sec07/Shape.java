package ddit.chap07.sec07;

public abstract class Shape {
	String kind;
	String color;

	public Shape(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}

	public abstract void draw();

	public String toString() {
		return "도형의 종류: " + kind + "\n바탕색상: " + color;
	}
}