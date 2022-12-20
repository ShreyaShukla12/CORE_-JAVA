package in.co.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCFC {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("four");
		
		Iterator it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
