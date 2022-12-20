package in.co.Oops;

public class TestTriangleinherit {
	public static void main(String[] args) {
		TriangleInherit t =new TriangleInherit();
		
		t.setColor("blue");
		t.setBorderwidth(20);
		t.setBase(10);
		t.setHeight(45);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderwidth());
		System.out.println("area:"+t.area());
	}

}
