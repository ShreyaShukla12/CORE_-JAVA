package in.co.Oops;

public class TriagleInheritConst {
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public TriagleInheritConst(int b, int h) {
		this.base = b;
		this.height = h;
	}

	public double area2() {
		return ((base * height) / 2);
	}

}
