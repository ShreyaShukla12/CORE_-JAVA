package in.co.Oops;

public class TestShapepolyarray {
	public static void main(String[] args) {

		Shapepolyarray[] s = new Shapepolyarray[3];
		s[0] = new Rectanglepolyarray(10, 20);
		s[1] = new Trianglepolyarray(5, 25);
		s[2] = new Circlepolyarray(30);

		double totalarea = 0;
		for (int i = 0; i < s.length; i++) {
			totalarea = totalarea + s[i].area();
		}
		System.out.println("total area=" + totalarea);
	}

}
