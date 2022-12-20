package in.co.ExeptionHandling;

public class GenericCatch {
	public static void main(String[] args) {
		String name = "Ram";
		try {
			System.out.println("length of name is :" + name.length());
			System.out.println("character at 5th position:" + name.charAt(4));

		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
			// TODO: handle exception
		}
	}

}
