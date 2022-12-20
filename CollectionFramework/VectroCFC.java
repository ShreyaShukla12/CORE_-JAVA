package in.co.CollectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectroCFC {
	public static void main(String[] args) {
		Vector a = new Vector();
		a.add("red");
		a.add("green");

//		Iterator it=a.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());

		Enumeration e = a.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
 