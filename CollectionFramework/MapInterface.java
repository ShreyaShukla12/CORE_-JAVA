package in.co.CollectionFramework;

import java.util.HashMap;

public class MapInterface {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "red");
		m.put(2, "blue");
		m.put(3, "yellow");
		m.put(4, "red");

		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("blue"));
		System.out.println(m.entrySet());
		System.out.println(m.get(3));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.remove(2));
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.values());
		m.clear();

	}

}