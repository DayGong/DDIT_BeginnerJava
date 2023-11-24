package ddit.chap07.sec06;

public class UnitTest {

	public static void main(String[] args) {
		Unit u = new Tank(200, 300);
		System.out.print(u +" unit이 ");
		u.move(500, 700);
	}

}
