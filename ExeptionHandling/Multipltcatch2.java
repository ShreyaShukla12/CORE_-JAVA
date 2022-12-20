package in.co.ExeptionHandling;

public class Multipltcatch2 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println("length of name is:" + name.length());
			System.out.println("character at 6th place is:" + name.charAt(5));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string is too short");
			// TODO: handle exception
		} catch (NullPointerException e) {
			System.out.println("maybe something else");
		} finally {
			System.out.println("hello...its ok");
		}
	}

}
