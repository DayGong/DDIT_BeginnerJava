package ddit.chap07.sec06;

public class Tank extends GroundUnit {

	Tank(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {
		String res = "(" + super.x + ", " + super.y + ")";
		System.out.println(res + "에서 (" + x + "," + y + ") 위치로 이동");
	}

	@Override
	public String toString() {
		return "TANK";
	}

}
