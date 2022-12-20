package in.co.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCFC {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		
		Iterator it=h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
