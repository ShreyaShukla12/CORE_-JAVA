package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("How are you doing");
		c.add("what is happening");
		c.add("this is good");

		System.out.println("Length of collection:" + c.size());

		for (Object ele : c) {
			System.out.println(ele);
		}
		Object[] oArray = c.toArray();

		for (Object ele : oArray) {
			String s = (String) ele;
			System.out.println(s);
	}

	}

}
