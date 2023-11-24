package ddit.chap07.sec03;

public class ColorTv extends Tv {
	int resolution;

	ColorTv(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}

	int getResolution() {
		return this.resolution;
	}

	@Override //annotation(주석)
	public String toString() {
		return "크기: " + super.getSize() + "\n해상도: " + resolution;
	}
}
