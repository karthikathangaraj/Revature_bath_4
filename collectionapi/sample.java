package collectionapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sample {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(11);
		a1.add("a");
		System.out.println(a1);
		Collection<String> c1=new HashSet<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("c");
		c1.add("c");
		System.out.println(c1);

	}

}
