package in.co.ExerciseCh6;

public class Question4 {
	public static void main(String[] args) {
		String a = "apple";
		String b = "mango";
		String e = "apple";

		String c = new String("apple").intern();
		String d = new String("apple");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c == d);
		System.out.println(a == e);
		System.out.println(a == d);
	}

}
