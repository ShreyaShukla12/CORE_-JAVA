package in.co.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue a = new LinkedList();

		a.add("one");
		a.add(2);
		a.add("three");
		a.add(4);
		a.add("five");
		System.out.println(a);
		
		System.out.println(a.offer(6));
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.remove());
		System.out.println(a);
		System.out.println(a.element());
		System.out.println(a);
		System.out.println(a.add(7));
		System.out.println(a);
	}

}
