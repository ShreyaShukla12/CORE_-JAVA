package in.co.Oops;

public class Rectangleinherit extends InheritanceShape {
	private int length;
	private int width;

	public int area() {
		return (length * width);
	};

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
