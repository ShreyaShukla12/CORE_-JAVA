package in.co.Oops;

public class Circleabs extends Shapeabs {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		// TODO Auto-generated method stub
		return (3.14 * radius * radius);
	}

}
