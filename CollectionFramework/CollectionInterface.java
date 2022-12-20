package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionInterface {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add("ram");
		a.add(2);
		a.add("vaishnavi");
		a.add("false");
		a.add('s');

		ArrayList a1 = new ArrayList();
		a1.add("apple");
		a1.add("2");
		a1.add("sum");

		System.out.println(a.add("H"));
		System.out.println(a);

		System.out.println(a.addAll(3, a1));
		System.out.println(a);

		a.retainAll(a1);
		System.out.println(a);
		a.removeAll(a1);
		System.out.println(a);
//		// System.out.println(a.clear());
//		System.out.println(a.isEmpty());
//		System.out.println(a);
//		System.out.println(a.size());
//		System.out.println(a.remove(1));
//		System.out.println(a);
//		System.out.println(a.containsAll(a));
//		System.out.println(a.contains("false"));
//
//		System.out.println("------------");
//		Iterator it = a.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			if (it.hasNext()) {
//				it.remove();
//				System.out.println(a);
	}

}
