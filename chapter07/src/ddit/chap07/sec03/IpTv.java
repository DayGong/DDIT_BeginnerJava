package ddit.chap07.sec03;

public class IpTv extends ColorTv {
	String address;

	IpTv(int size, int resolution, String address) {
		super(size, resolution);
		this.address = address;
	}

	String getIpAddress() {
		return this.address;
	}

	@Override
	public String toString() { //super.toString() 사용
		return super.toString() + "\nip주소: " + this.address;
	}
}
