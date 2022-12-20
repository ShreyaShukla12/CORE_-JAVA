package in.co.Oops;

public class Shape2 {
	private String color;
	private int borderwith;
	public static final double PI = 3.14;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwith() {
		return borderwith;
	}

	public void setBorderwith(int borderwith) {
		this.borderwith = borderwith;
	}

	public static void main(String[] args) {
		Shape2 sa = new Shape2();
		Shape2 sb = new Shape2();
		System.out.println(sa.PI);
		System.out.println(sb.PI);
		System.out.println(Shape2.PI);

	}
}
