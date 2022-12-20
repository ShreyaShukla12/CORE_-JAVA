package in.co.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCFC {
	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
