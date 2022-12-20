package in.co.Oops;

public class ShapeInheritConstructor {
	protected String color;
	protected int borderwidth;

	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public ShapeInheritConstructor() {// defaul constructor

	}

	public ShapeInheritConstructor(String a, int b) {
		this.color = a;
		this.borderwidth = b;
	}

	// public void display() {
	// System.out.println("this is display method");
	// }
}
