package in.co.Oops;

public class TestRectangleinherit {
	public static void main(String[] args) {
		Rectangleinherit r=new Rectangleinherit();
		
		r.setColor("black");
		r.setBorderwidth(20);
		r.setLength(10);
		r.setWidth(5);
		
		System.out.println(r.getColor());
		System.out.println(r.getBorderwidth());
		System.out.println("area:"+r.area());
		}

}
