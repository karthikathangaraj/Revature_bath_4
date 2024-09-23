package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylIst {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>(4);
		ArrayList<Integer> a2=new ArrayList<Integer>(4);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(2, 22);
		a2.add(9);
		a2.add(8);
		a1.addAll(1, a2);
		//a2.clear();
		//a1.removeAll(a2);
		System.out.println(a1.get(1));
		a1.set(1, 100);
		System.out.println(a1);
		System.out.println(a1.indexOf(100));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.subList(2,5));
		Object[] a3=a1.toArray();
		System.out.println(a3);
		List<Object> ca=Arrays.asList(a3);
		System.out.println(ca);
	}

}
