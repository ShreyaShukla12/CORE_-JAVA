package in.co.CollectionFramework;

import java.util.Hashtable;

public class HashTableCFC {
	public static void main(String[] args) {
		Hashtable s = new Hashtable();
		s.put(1, "red");
		s.put(5, "blue");
		s.put(0, "green");

		System.out.println(s.equals(s));
		System.out.println(s.hashCode());
		System.out.println(s);
		System.out.println(s.get(5));

	}

}
