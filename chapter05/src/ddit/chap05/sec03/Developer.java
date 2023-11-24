package ddit.chap05.sec03;

public class Developer {
	String name;
	int career;
	DeviceType type;
	static Developer d = new Developer();

	public static void main(String[] args) {
		getInfo();
		getDevType();
	}

	public static void getInfo() {
		d.name = "박지원";
		d.career = 5;
		d.type = DeviceType.SERVER;

		System.out.println("개발자명: " + d.name);
		System.out.println("개발경력: " + d.career);
		System.out.println("직무파트: " + d.type);
	}

	public static void getDevType() {
		for(DeviceType dev : DeviceType.values()) {
			System.out.println(dev+", "+dev.getName());
		}
	}
}
