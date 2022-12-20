package in.co.Oops;

public class TriangleOverriding extends ShapeOverriding {
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height * 0.5);
	}

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
