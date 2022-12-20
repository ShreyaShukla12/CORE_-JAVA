package in.co.Oops;

public class RectanglePRT extends ShapePRT {
	private int length;
	private int breadth;

	public RectanglePRT(int l, int b) {
		this.length = l;
		this.breadth = b;

	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (length * breadth);
	}

}
