package in.co.Oops;

public class RectangleInheritConst extends ShapeInheritConstructor {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	// public RectangleInheritConst(int l, int w) {
	// this.length=l;
	// this.width=w;
	// }

	public RectangleInheritConst(int l, int w, String a, int b) {
		super(a, b);// constructor invocation
		this.length = l;
		this.width = w;
	}

	public double area() {
		return (length * width);
	}

	public void test() {
		int a = super.borderwidth;// parent class attribute.
		String c = super.color;
		System.out.println("This is value of border width: " + a);
		System.out.println("This is value of color: " + c);

		// super.display();

	}

}
