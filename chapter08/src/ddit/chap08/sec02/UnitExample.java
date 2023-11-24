package ddit.chap08.sec02;

public class UnitExample {
	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine();
		SCV scv = new SCV();
		
		scv.repair(t);
		scv.repair(new DropShip());
//		scv.repair(m);
	}
}
