package in.co.Oops;

public class TestCircleinherit {
	public static void main(String[] args) {
		CircleInheritance c=new CircleInheritance();
		
		c.setBorderwidth(10);
		c.setColor("white");
		c.setRadius(5);
	
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println("area:"+c.area());
	}
	
}
