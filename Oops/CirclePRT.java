package in.co.Oops;

public class CirclePRT extends ShapePRT {
	private int radius;
	
	public CirclePRT(int r) {
		this.radius = r;
	}

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
