package ddit.chap08.sec02;

public class Unit {
	int hitPoint;
	final int MAX_HP; // 직접 대입, 생성자 메서드를 통한 대입, 초기화 블록을 통한 대입

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "탱크";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(50);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "해병";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(250);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "수송선";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(70);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "수리공장";
	}

	void repair(Repairable r) {
		if (r instanceof Unit) { // r이 Unit 타입 객체인 경우
			Unit u = (Unit) r; // 다운캐스팅
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 수리 완료");
		}
	}
}