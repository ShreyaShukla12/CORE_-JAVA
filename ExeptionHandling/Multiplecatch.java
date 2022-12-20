package in.co.ExeptionHandling;

public class Multiplecatch {
	public static void main(String[] args) {
		String name = "Ram";
		try {
			System.out.println("length of the name is: " + name.length());
			System.out.println("Character at 5th position is " + name.charAt(4));

		} catch (StringIndexOutOfBoundsException e ) {
			System.out.println("name is too short");
			// TODO: handle exception
		}catch (NullPointerException e) {
			System.out.println("not so nice");
			// TODO: handle exception
		} finally {
			System.out.println("Hey all");
		}
	}
}
	