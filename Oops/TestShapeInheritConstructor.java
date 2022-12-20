package in.co.Oops;

public class TestShapeInheritConstructor {
	public static void main(String[] args) {

		// RectangleInheritConst r=new RectangleInheritConst(10,20);
		
		RectangleInheritConst r = new RectangleInheritConst(10, 20, "red", 40);
		System.out.println("area of rectanle:" + r.area());
		r.test();

		TriagleInheritConst t = new TriagleInheritConst(25, 40);
		System.out.println("area of triangle:" + t.area2());

		CircleInheritConst c = new CircleInheritConst(4);
		System.out.println("area of circle:" + c.area3());
	}

}
