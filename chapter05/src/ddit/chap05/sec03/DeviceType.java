package ddit.chap05.sec03;

public enum DeviceType {
	MOVILE("안드로이드"),
	WEB("스프링"),
	SERVER("리눅스");
	
	private final String name; // 상수
	
	DeviceType(String name) { // name과 값을 연결
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
