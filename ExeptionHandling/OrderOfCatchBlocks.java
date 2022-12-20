package in.co.ExeptionHandling;

public class OrderOfCatchBlocks {
	public static void main(String[] args) {
		String name = "Ram";
		try {
			System.out.println("length of name is:" + name.length());
			System.out.println("character at 5th position is:" + name.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string is short");
			// TODO: handle exception
		} catch (RuntimeException e) {
			System.out.println("error:" + e.getMessage());
			// TODO: handle exception
		}
	}

}
