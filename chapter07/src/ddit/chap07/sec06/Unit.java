package ddit.chap07.sec06;

public abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("현 위치(" + x + ", " + y + ")에서 멈춤");
	}
}
