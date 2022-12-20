package in.co.ExeptionHandling;

public class TestLoginexception {
	public static void main(String[] args) {
		String name = "adminn";
		if (name == "admin") {
			System.out.println("valid00");
		} else {
			try {
				throw new Loginexception();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
		}
	}

}
