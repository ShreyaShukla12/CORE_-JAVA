package in.co.Oops;

public class TestShapePRT extends ShapePRT {

	public static ShapePRT getShape(int i) {
		if (i == 1) {
			return new RectanglePRT(5, 5);

		}
		if (i == 2) {
			return new TrianglePRT(3, 6);
		}
		if (i == 3) {
			return new CirclePRT(5);
		}

		return null;

	}

	public static void main(String[] args) {
		ShapePRT s = new ShapePRT();
		s.setColor("black");
		s.setBorderwidth(10);

		System.out.println("color:" + s.getColor());
		System.out.println("borderwidth:" + s.getBorderwidth());

		for (int i = 1; i < 4; i++) {
			System.out.println(getShape(i).area());
			// System.out.println(getShape(2).area());
			// System.out.println(getShape(3).area());

		}
	}
}
