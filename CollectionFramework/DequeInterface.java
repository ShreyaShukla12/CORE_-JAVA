package in.co.CollectionFramework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
	public static void main(String[] args) {
		Deque d = new LinkedList();

		d.add("chai");
		d.add("sandwitch");
		d.add("coffee");
		d.add("burger");
        d.addFirst(2);
		System.out.println(d);
		d.addLast(9);
		System.out.println(d);
		d.offerFirst(10);
		System.out.println(d);
		d.offerLast(5);
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.pollFirst();
		System.out.println(d);
		d.pollLast();
		System.out.println(d);
		System.out.println(d.peekFirst());
		System.out.println(d);
		System.out.println(d.peekLast());
		System.out.println(d);

		Object obj = d.getLast();

		System.out.println(obj);
		System.out.println(d.getFirst());

	}

}
