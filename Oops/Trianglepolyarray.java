package in.co.Oops;

public class Trianglepolyarray extends Shapepolyarray {
	private int base;
	private int height;

	public Trianglepolyarray(int b, int h) {
		this.base = b;
		this.height = h;
	}

	public double area() {
		double areaT = 0.5 * base * height;
		System.out.println("areaT=" + areaT);
		return areaT;

	}

}
