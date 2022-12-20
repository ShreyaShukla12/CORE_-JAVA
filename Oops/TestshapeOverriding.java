package in.co.Oops;

public class TestshapeOverriding {
	public static void main(String[] args) {
		TriangleOverriding t = new TriangleOverriding();

		t.setColor("red");
		t.setBorderwidth(10);
		t.setBase(5);
		t.setHeight(15);

		System.out.println("color:" + t.getColor());
		System.out.println("Borderwidth:" + t.getBorderwidth());
		System.out.println("area:" + t.area());
	}

}
