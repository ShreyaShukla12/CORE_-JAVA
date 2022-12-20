package in.co.Oops;

public class CircleInheritance extends InheritanceShape {
	private int radius;

	public double area() {
		return (3.14 * radius * radius);
	};

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
