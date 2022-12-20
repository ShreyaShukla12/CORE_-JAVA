package in.co.Oops;

public class TrianglePRT extends ShapePRT {
	private int base;
	private int height;

	public TrianglePRT(int b, int h) {
		this.base = b;
		this.height = h;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (0.5 * base * height);
	}

}
