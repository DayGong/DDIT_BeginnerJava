package ddit.chap07.sec01;

public class Shape {
	String name;
	int point;
	
	Shape(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	void draw() {
		System.out.println("을 그리다.");
	}
}