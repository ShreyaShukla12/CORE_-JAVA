package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List s = new ArrayList();

		s.add("cat");
		s.add("A");
		s.add("15");
		s.add(3, "red");

		System.out.println(s.set(1, "ram"));
		System.out.println(s);
		System.out.println(s.get(2));
		System.out.println(s.remove(1));
		System.out.println(s);
		System.out.println(s.set(0, "bike"));
		System.out.println(s);
		System.out.println(s.subList(0, 3));
		System.out.println(s.indexOf("15"));
		System.out.println(s.lastIndexOf("bike"));

	}
}
