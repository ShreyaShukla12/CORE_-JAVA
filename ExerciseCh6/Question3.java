package in.co.ExerciseCh6;

public class Question3 {
	public static void main(String[] args) {
		String name = "Shreya Shukla";
		System.out.println(name);

		int count = 0;
		char ch ='e';

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("occurances of " + ch + " are :" + count);
	}

}
