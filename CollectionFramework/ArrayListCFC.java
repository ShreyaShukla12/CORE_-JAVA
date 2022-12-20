package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCFC {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("one");
		a.add("three");
		a.add("seven");
		a.add("ten");
		a.add("zero");
		System.out.println(a);
		a.add(3, "five");
		System.out.println(a);
		System.out.println(a.get(3));
		System.out.println(a);
		// Collection.sort(a);
		// System.out.println(a);

		ArrayList subList = new ArrayList(a.subList(1, 4));
		System.out.println(subList);

		System.out.println(a.toArray());

	}

}
