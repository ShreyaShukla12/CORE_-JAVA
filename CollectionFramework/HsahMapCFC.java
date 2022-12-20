package in.co.CollectionFramework;

import java.util.HashMap;

public class HsahMapCFC {
	public static void main(String[] args) {
		HashMap a = new HashMap();
		a.put(1, "red");
		a.put(2, "black");
		a.put(0, "blue");
		a.put(5, null);
		a.put(null, "white");

		System.out.println(a);
		System.out.println(a.get(0));
		a.remove(0);
		System.out.println(a);
		System.out.println(a.values());
		System.out.println(a.keySet());
		System.out.println(a.entrySet());

	}

}
