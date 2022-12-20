package in.co.CollectionFramework;

import java.util.TreeMap;

public class TreeMapCFC {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(9, "apple");
		t.put(1, "banana");
		t.put(3, "mango");
		t.put(0, "grapes");

		System.out.println(t);
		System.out.println(t.get(9));

	}

}
