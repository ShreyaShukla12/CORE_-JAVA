package in.co.CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
	Set s = new HashSet();

		
		  s.add("one"); 
		  s.add("two");
		  s.add("three");
		  s.add("four");
		 
//		s.add(2);
//		s.add(3);
//		s.add(4);
//		s.add(1);

		System.out.println(s);
		System.out.println("---------------");
		
		
//		for (Object o : s) {
//			System.out.println(o);
			System.out.println(s.fir);
		
			System.out.println(s.last());
			
		}
	}


