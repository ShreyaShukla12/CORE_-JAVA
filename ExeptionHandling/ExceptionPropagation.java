package in.co.ExeptionHandling;

public class ExceptionPropagation {
	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("caught by dad, raised by son");
			// TODO: handle exception
		}
	}

	public static void mom() {
		son();
	}

	public static void son() {
		RuntimeException e = new RuntimeException("I made a mistake");
		throw e;
	}

}
