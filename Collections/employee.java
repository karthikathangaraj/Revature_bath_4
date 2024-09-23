package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class employee  implements Iterable{
	
	List<Integer> s1=null;
	public employee()
	{
		s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
	}
	

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return s1.iterator();
	}

}
