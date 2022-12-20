package in.co.ExeptionHandling;

public class Arithmetic {
	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		double d;

		try {
			d = b / a;
			System.out.println(d);
		} catch (Exception e) {
			System.err.println("0 is not divisible by 20");
			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("Hello Shreya");
			System.out.println("hii");
		}

	}
}