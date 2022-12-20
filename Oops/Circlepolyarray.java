package in.co.Oops;

public class Circlepolyarray extends Shapepolyarray {
	private int radius;

	public Circlepolyarray(int r) {
		this.radius = r;
	}

	public double area() {
		double areaC = 3.14 * radius * radius;
		System.out.println("areaC=" + areaC);
		return areaC;
	}
}
