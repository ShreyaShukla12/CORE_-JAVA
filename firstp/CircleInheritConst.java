package firstp;

public class CircleInheritConst {
	private int radius;

	public int getRadius() {
		return radius;
	}
	
	public CircleInheritConst(int r) {
		this.radius=r;
	}
	
	public double area3() {
		return(3.14*radius*radius);
	}

}
