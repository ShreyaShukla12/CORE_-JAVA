package in.co.Oops;

public class Rectanglepolyarray extends Shapepolyarray {
	private int length;
	private int width;

	public Rectanglepolyarray(int l, int w) {
		this.length = l;
		this.width = w;
	}

	public double area() {
		double areaR = length * width;
		System.out.println("areaR=" + areaR);
		return (areaR);
	}
}