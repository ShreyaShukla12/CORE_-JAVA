package in.co.CollectionFramework;

import java.util.Stack;

public class StackCFC {// CFC is Collection framework classes
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
